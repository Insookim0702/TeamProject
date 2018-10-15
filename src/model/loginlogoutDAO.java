package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import domain.jspbean;
import util.DBUtil;

public class loginlogoutDAO {
	
/*===================로그인 처리 클래스 =======================*/
	
	/**
     * 로그인시 아이디, 비밀번호 체크 메서드
     * @param id 로그인할 아이디
     * @param pwcheck 비밀번호
     * @return name : loginCheck() 수행 후 결과값 
     */

	public static String loginCheck(String id, String pwcheck) throws Exception{
		Connection con =null;
		PreparedStatement ps =null;
		ResultSet rs =null;
		String name =null;
		try {
			con =DBUtil.getConnection();
			System.out.println("loginlogoutDAO : DB 접속하였습니다.");
			ps = con.prepareStatement("select name from member where id =? and pwcheck =?");
			ps.setString(1, id);
			ps.setString(2, pwcheck);
			rs =ps.executeQuery();
			System.out.println("loginlogoutDAO : SQL을 DB 에서 실행하였습니다.");
			if(rs.next()) {
				name =rs.getString(1);
			}
			DBUtil.close(con, ps,rs);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("loginlogoutDAO : DB에 입력되지 않았습니다.");
		}
		System.out.println("loginlogoutDAO :" + name);
		return name;
	}


}
