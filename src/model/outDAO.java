package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;

import util.DBUtil;

public class outDAO {
	/*
	 * *퇴실하기*
	 */
	public void outdao(String no) {
		Connection con =null;
		PreparedStatement ps =null;
		ResultSet rset =null;
		
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("UPDATE register SET outtime='"+time+"' WHERE inout ='입실' and bednum ='"+ no +"'");
			ps.executeUpdate();
			ps =con.prepareStatement("UPDATE register SET inout = '퇴실' WHERE inout ='입실' and bednum ='"+no+"'");
			ps.executeUpdate();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("DB에 접근하지 못했습니다.");
			
		}
	}

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
	
}
