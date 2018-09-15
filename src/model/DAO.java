package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;

import domain.registerDTO;
import util.DBUtil;

public class DAO {
	/*===================년/월/일/시/분/초 반환하는 클래스===============================*/
	Calendar cal = Calendar.getInstance();  //cal변수를 static으로 바꿔줘야 했다.
	public String getYear() {
		return String.valueOf(cal.get(Calendar.YEAR));
	}
	public String getMonth() {
		return String.valueOf((cal.get(Calendar.MONTH)+1));
	}
	public String getDay() {
		return String.valueOf(cal.get(Calendar.DATE));
	}
	public int getHour() {
		return cal.get(Calendar.HOUR);
	}
	public int getMinute() {
		return cal.get(Calendar.MINUTE);
	}
	public int getSecond() {
		return cal.get(Calendar.SECOND);
	}
	
	/*static */   //왜 static으로 변환해 줘야 하는가??
	public static ArrayList<registerDTO> selectAll() throws Exception{
		Connection con =null;
		PreparedStatement ps =null;
		ResultSet rset =null;
		ArrayList<registerDTO> all =null;
		/*static 대신에 클래스 객체를 생성해 줘서 static으로 인한 메모리 낭비를 줄이고 selectAll()메소드 사용시에만 메모리가 사용되도록 설계하였다.*/
		DAO dao = new DAO();
		String day = dao.getYear()+ " 년" + dao.getMonth()+ " 월" + dao.getDay()+ "일";
		
		try {
			con = DBUtil.getConnection();
			
			ps = con.prepareStatement("select * from register where today = '"+day+"'");
			rset = ps.executeQuery();
			
			all = new ArrayList<registerDTO>();
			
			while (rset.next()) {
				all.add(new registerDTO(rset.getString(1), rset.getString(2), rset.getString(3), 
						rset.getString(4), rset.getString(5), rset.getString(6), 
						rset.getString(7), rset.getString(8)));
			}
		}finally {
			DBUtil.close(con,ps,rset);
		}
		return all;
	}
	
	/*======================년월일시분초를 DB에 저장하는 클래스=======================*/
	public void insertregister(registerDTO dto) {
		Connection con =null;
		PreparedStatement ps =null;
		//ResultSet rs =null;
		//ArrayList<registerDTO> all = null;
		
		try {
			con = DBUtil.getConnection();
			String sql ="insert into register values(?,?,?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, getYear()+ " 년" + getMonth()+ " 월" + getDay()+ "일");
			ps.setString(2, dto.getId());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getPhone());
			ps.setString(5, dto.getBednum());
			ps.setString(6, getHour()+"시" +getMinute()+" 분" );
			ps.setString(7, "-");
			ps.setString(8, "입실");
			ps.executeUpdate();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("DB에 입력되지 않았습니다.");
		}
	}
	
	/* ====================침대번호 가져오기, 목적 : form.jsp에 뿌려서 침대 상태 표시=========================*/
	public static String getbednum1() throws Exception{
		Connection con =null;
		PreparedStatement ps =null;
		ResultSet rs = null;
		String bednum =null;
		DAO dao = new DAO();
		String day = dao.getYear()+ " 년" + dao.getMonth()+ " 월" + dao.getDay()+ "일";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("select bednum from register where inout ='입실' and bednum='1' and today ='"+day+"'");
			rs = ps.executeQuery();
			if(rs.next()) {
				bednum =rs.getString(1);
				System.out.println(bednum);
				if(bednum.equals("1")) { //************************오류 생각 많이함.... 문자열은 equals()로 비교해야 한다.
					bednum ="true";
					System.out.println(bednum);
				}else {
					bednum="false";
					System.out.println(bednum);
				}
			}
		}finally {
			DBUtil.close(con,ps,rs);
		}
		return bednum;
	}
	public static String getbednum2() throws Exception{
		Connection con =null;
		PreparedStatement ps =null;
		ResultSet rs = null;
		String bednum =null;
		DAO dao = new DAO();
		String day = dao.getYear()+ " 년" + dao.getMonth()+ " 월" + dao.getDay()+ "일";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("select bednum from register where inout ='입실' and bednum='2' and today ='"+day+"'");
			rs = ps.executeQuery();
			if(rs.next()) {
				bednum =rs.getString(1);
				System.out.println(bednum);
				if(bednum.equals("2")) { //************************오류 생각 많이함.... 문자열은 equals()로 비교해야 한다.
					bednum ="true";
					System.out.println(bednum);
				}else {
					bednum="false";
					System.out.println(bednum);
				}
				
			}
		}finally {
			DBUtil.close(con,ps,rs);
		}
		return bednum;
	}
	public static String getbednum3() throws Exception{
		Connection con =null;
		PreparedStatement ps =null;
		ResultSet rs = null;
		String bednum =null;
		DAO dao = new DAO();
		String day = dao.getYear()+ " 년" + dao.getMonth()+ " 월" + dao.getDay()+ "일";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("select bednum from register where inout ='입실' and bednum='3' and today ='"+day+"'");
			rs = ps.executeQuery();
			if(rs.next()) {
				bednum =rs.getString(1);
				System.out.println(bednum);
				if(bednum.equals("3")) { //************************오류 생각 많이함.... 문자열은 equals()로 비교해야 한다.
					bednum ="true";
					System.out.println(bednum);
				}else {
					bednum="false";
					System.out.println(bednum);
				}
				
			}
		}finally {
			DBUtil.close(con,ps,rs);
		}
		return bednum;
	}
	public static String getbednum4() throws Exception{
		Connection con =null;
		PreparedStatement ps =null;
		ResultSet rs = null;
		String bednum =null;
		DAO dao = new DAO();
		String day = dao.getYear()+ " 년" + dao.getMonth()+ " 월" + dao.getDay()+ "일";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("select bednum from register where inout ='입실' and bednum='4' and today ='"+day+"'");
			rs = ps.executeQuery();
			if(rs.next()) {
				bednum =rs.getString(1);
				System.out.println(bednum);
				if(bednum.equals("4")) { //************************오류 생각 많이함.... 문자열은 equals()로 비교해야 한다.
					bednum ="true";
					System.out.println(bednum);
				}else {
					bednum="false";
					System.out.println(bednum);
				}
				
			}
		}finally {
			DBUtil.close(con,ps,rs);
		}
		return bednum;
	}
	public static String getbednum5() throws Exception{
		Connection con =null;
		PreparedStatement ps =null;
		ResultSet rs = null;
		String bednum =null;
		DAO dao = new DAO();
		String day = dao.getYear()+ " 년" + dao.getMonth()+ " 월" + dao.getDay()+ "일";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("select bednum from register where inout ='입실' and bednum='5' and today ='"+day+"'");
			rs = ps.executeQuery();
			if(rs.next()) {
				bednum =rs.getString(1);
				System.out.println(bednum);
				if(bednum.equals("5")) { //************************오류 생각 많이함.... 문자열은 equals()로 비교해야 한다.
					bednum ="true";
					System.out.println(bednum);
				}else {
					bednum="false";
					System.out.println(bednum);
				}
				
			}
		}finally {
			DBUtil.close(con,ps,rs);
		}
		return bednum;
	}
	public static String getbednum6() throws Exception{
		Connection con =null;
		PreparedStatement ps =null;
		ResultSet rs = null;
		String bednum =null;
		DAO dao = new DAO();
		String day = dao.getYear()+ " 년" + dao.getMonth()+ " 월" + dao.getDay()+ "일";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("select bednum from register where inout ='입실' and bednum='6' and today ='"+day+"'");
			rs = ps.executeQuery();
			if(rs.next()) {
				bednum =rs.getString(1);
				System.out.println(bednum);
				if(bednum.equals("6")) { //************************오류 생각 많이함.... 문자열은 equals()로 비교해야 한다.
					bednum ="true";
					System.out.println(bednum);
				}else {
					bednum="false";
					System.out.println(bednum);
				}
				
			}
		}finally {
			DBUtil.close(con,ps,rs);
		}
		return bednum;
	}
	public static String getbednum7() throws Exception{
		Connection con =null;
		PreparedStatement ps =null;
		ResultSet rs = null;
		String bednum =null;
		DAO dao = new DAO();
		String day = dao.getYear()+ " 년" + dao.getMonth()+ " 월" + dao.getDay()+ "일";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("select bednum from register where inout ='입실' and bednum='7' and today ='"+day+"'");
			rs = ps.executeQuery();
			if(rs.next()) {
				bednum =rs.getString(1);
				System.out.println(bednum);
				if(bednum.equals("7")) { //************************오류 생각 많이함.... 문자열은 equals()로 비교해야 한다.
					bednum ="true";
					System.out.println(bednum);
				}else {
					bednum="false";
					System.out.println(bednum);
				}
				
			}
		}finally {
			DBUtil.close(con,ps,rs);
		}
		return bednum;
	}
	public static String getbednum8() throws Exception{
		Connection con =null;
		PreparedStatement ps =null;
		ResultSet rs = null;
		String bednum =null;
		DAO dao = new DAO();
		String day = dao.getYear()+ " 년" + dao.getMonth()+ " 월" + dao.getDay()+ "일";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("select bednum from register where inout ='입실' and bednum='8' and today ='"+day+"'");
			rs = ps.executeQuery();
			if(rs.next()) {
				bednum =rs.getString(1);
				System.out.println(bednum);
				if(bednum.equals("8")) { //************************오류 생각 많이함.... 문자열은 equals()로 비교해야 한다.
					bednum ="true";
					System.out.println(bednum);
				}else {
					bednum="false";
					System.out.println(bednum);
				}
				
			}
		}finally {
			DBUtil.close(con,ps,rs);
		}
		return bednum;
	}
	public static String getbednum9() throws Exception{
		Connection con =null;
		PreparedStatement ps =null;
		ResultSet rs = null;
		String bednum =null;
		DAO dao = new DAO();
		String day = dao.getYear()+ " 년" + dao.getMonth()+ " 월" + dao.getDay()+ "일";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("select bednum from register where inout ='입실' and bednum='9' and today ='"+day+"'");
			rs = ps.executeQuery();
			if(rs.next()) {
				bednum =rs.getString(1);
				System.out.println(bednum);
				if(bednum.equals("9")) { //************************오류 생각 많이함.... 문자열은 equals()로 비교해야 한다.
					bednum ="true";
					System.out.println(bednum);
				}else {
					bednum="false";
					System.out.println(bednum);
				}
				
			}
		}finally {
			DBUtil.close(con,ps,rs);
		}
		return bednum;
	}
}