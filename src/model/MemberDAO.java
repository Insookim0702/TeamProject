package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;

import domain.jspbean;
import util.DBUtil;

/*
 * JSPMEMBER테이블과 연관된 DAO다
 * 회원 데이터를 처리하는 클래스이다.
 * DataAccessObject 테이블 당 한개의 DAO를 작성
 * */
public class MemberDAO {
	//private static MemberDAO instance;
	
	/**
     * 아이디 중복체크를 한다.
     * @param id 아이디
     * @return x : 아이디 중복여부 확인값
     */
	public static boolean duplicateIdCheck(String id) throws Exception{
		Connection con =null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean bool = false;
		System.out.println("DAO에서" + id);
		//MemberDAO dao = new MemberDAO();
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("SELECT ID FROM MEMBER WHERE ID=?");
			ps.setString(1, id);
			rs =ps.executeQuery();
			if(rs.next()) bool = true; //아이디 존재(중복)
			
			return bool;
			
		}finally {
			DBUtil.close(con, ps, rs);
		}
	}
	
	/*
     * 관리자 회원가입을 한다.
     */
	
	// 회원정보를 MEMBER 테이블에 저장하는 메서드
    
    public void insertMember(jspbean dto) {
		Connection con =null;
		PreparedStatement ps =null;
		try {
			con = DBUtil.getConnection();
			System.out.println("DB와 연결되었습니다.");
			String sql ="INSERT INTO member VALUES(?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPwcheck());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getbirth());
			ps.setString(5, dto.getDepartment());
			ps.setString(6, getYear()+ " 년" + getMonth()+ " 월" + getDay()+ "일");
			System.out.println("SQL문 작성 완료.");
			ps.executeUpdate();
			System.out.println("DB에 저장하였습니다.");
			DBUtil.close(con, ps);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("DB에 입력되지 않았습니다.");
		}
	}
    
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
}
