package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;

import util.DBUtil;

public class outDAO {
	
	/*===================년/월/일/시/분/초 반환하는 클래스===============================*/
	Calendar cal = Calendar.getInstance();
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
	
	
	
	String time = getHour()+"시" +getMinute()+" 분"; 
	/********************퇴실하기************************/
	public void outregister1() {
		Connection con =null;
		PreparedStatement ps =null;
		ResultSet rset =null;
		
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("UPDATE register SET outtime='"+time+"' WHERE inout ='입실' and bednum ='1'");
			ps.executeUpdate();
			ps =con.prepareStatement("UPDATE register SET inout = '퇴실' WHERE inout ='입실' and bednum ='1'");
			ps.executeUpdate();
			
			
			ps.executeUpdate();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("DB에 접근하지 못했습니다.");
			
		}
	}
	/********************퇴실하기************************/
	public void outregister2() {
		Connection con =null;
		PreparedStatement ps =null;
		//ResultSet rset =null;
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("UPDATE register SET outtime='"+time+"' WHERE inout ='입실' and bednum ='2'");
			ps.executeUpdate();
			ps =con.prepareStatement("UPDATE register SET inout = '퇴실' WHERE inout ='입실' and bednum ='2'");
			ps.executeUpdate();
			ps.executeUpdate();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("DB에 접근하지 못했습니다.");
			
		}
	}
	/********************퇴실하기************************/
	public void outregister3() {
		Connection con =null;
		PreparedStatement ps =null;
		//ResultSet rset =null;
		try {
			con = DBUtil.getConnection();
			//ps =con.prepareStatement("UPDATE register SET inout = '퇴실' outtime = "+time+ "WHERE inout ='입실' and bednum ='3'");
			ps = con.prepareStatement("UPDATE register SET outtime='"+time+"' WHERE inout ='입실' and bednum ='3'");
			ps.executeUpdate();
			ps =con.prepareStatement("UPDATE register SET inout = '퇴실' WHERE inout ='입실' and bednum ='3'");
			ps.executeUpdate();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("DB에 접근하지 못했습니다.");
			
		}
	}
	/********************퇴실하기************************/
	public void outregister4() {
		Connection con =null;
		PreparedStatement ps =null;
		ResultSet rset =null;
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("UPDATE register SET outtime='"+time+"' WHERE inout ='입실' and bednum ='4'");
			ps.executeUpdate();
			ps =con.prepareStatement("UPDATE register SET inout = '퇴실' WHERE inout ='입실' and bednum ='4'");
			ps.executeUpdate();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("DB에 접근하지 못했습니다.");
			
		}
	}
	/********************퇴실하기************************/
	public void outregister5() {
		Connection con =null;
		PreparedStatement ps =null;
		ResultSet rset =null;
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("UPDATE register SET outtime='"+time+"' WHERE inout ='입실' and bednum ='5'");
			ps.executeUpdate();
			ps =con.prepareStatement("UPDATE register SET inout = '퇴실' WHERE inout ='입실' and bednum ='5'");
			ps.executeUpdate();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("DB에 접근하지 못했습니다.");
			
		}
	}
	/********************퇴실하기************************/
	public void outregister6() {
		Connection con =null;
		PreparedStatement ps =null;
		ResultSet rset =null;
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("UPDATE register SET outtime='"+time+"' WHERE inout ='입실' and bednum ='6'");
			ps.executeUpdate();
			ps =con.prepareStatement("UPDATE register SET inout = '퇴실' WHERE inout ='입실' and bednum ='6'");
			ps.executeUpdate();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("DB에 접근하지 못했습니다.");
			
		}
	}
	/********************퇴실하기************************/
	public void outregister7() {
		Connection con =null;
		PreparedStatement ps =null;
		ResultSet rset =null;
		String time = getHour()+"시" +getMinute()+" 분"; 
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("UPDATE register SET outtime='"+time+"' WHERE inout ='입실' and bednum ='7'");
			ps.executeUpdate();
			ps =con.prepareStatement("UPDATE register SET inout = '퇴실' WHERE inout ='입실' and bednum ='7'");
			ps.executeUpdate();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("DB에 접근하지 못했습니다.");
			
		}
	}
	/********************퇴실하기************************/
	public void outregister8() {
		Connection con =null;
		PreparedStatement ps =null;
		ResultSet rset =null;
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("UPDATE register SET outtime='"+time+"' WHERE inout ='입실' and bednum ='8'");
			ps.executeUpdate();
			ps =con.prepareStatement("UPDATE register SET inout = '퇴실' WHERE inout ='입실' and bednum ='8'");
			ps.executeUpdate();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("DB에 접근하지 못했습니다.");
			
		}
	}
	/********************퇴실하기************************/
	public void outregister9() {
		Connection con =null;
		PreparedStatement ps =null;
		ResultSet rset =null;
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("UPDATE register SET outtime='"+time+"' WHERE inout ='입실' and bednum ='9'");
			ps.executeUpdate();
			ps =con.prepareStatement("UPDATE register SET inout = '퇴실' WHERE inout ='입실' and bednum ='9'");
			ps.executeUpdate();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("DB에 접근하지 못했습니다.");
			
		}
	}
	
}
