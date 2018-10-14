package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

import domain.majorcountDTO;
import util.DBUtil;

public class grahpDAO {
	/*
	 * 총 누적 이용수, 
	 */
	public static String counting(String no) throws Exception{
		System.out.print("counting()함수 시작");
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		DAO dao = new DAO();
		int rowCount =3;
		String day = dao.getYear()+ " 년" + dao.getMonth()+ " 월" + dao.getDay()+ "일";
		try {
			con = DBUtil.getConnection();
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			switch(no) {
			case "1": rs = stmt.executeQuery("SELECT * FROM register WHERE today = '"+ day +"'"); break;
			case "2" : rs = stmt.executeQuery("SELECT * FROM register WHERE today = '"+ day +"'"); break;
			case "3" : rs = stmt.executeQuery("SELECT * FROM register"); break;
			case "4" : rs = stmt.executeQuery("SELECT COUNT(*) FROM register WHERE inout = '입실' AND today = '"+ day +"'"); break;
			default :System.out.println("잘못된 형식입니다.");
			}
			rs.last();
			ResultSetMetaData rsmd = rs.getMetaData();
			if(no == "4") {rowCount = 9 - rowCount; System.out.println("빈 자리 개수는 " + rowCount);}
			else{
				rowCount = rs.getRow();
			}
			
			System.out.println("rs = " + rowCount);
		}finally {
			DBUtil.close(con,ps,rs);
		}
		return Integer.toString(rowCount);
	}
	
	/*
	 * 상위 학과 7개 누적 방문 수.
	 */
	public static ArrayList<majorcountDTO> totalMajor() throws Exception{
		System.out.println("totalMajor 함수 실행"); 
		Connection con = null; 
		PreparedStatement ps = null; 
		ResultSet rs = null; 
		ArrayList<majorcountDTO> all = null;
		grahpDAO dao = new grahpDAO();
		try {
			con= DBUtil.getConnection();
			ps = con.prepareStatement("SELECT major, COUNT(*) usecount register where major IS NOT NULL GROUP BY major ORDER BY usecount DESC;");
			rs = ps.executeQuery();
			all = new ArrayList<majorcountDTO>();
			
			while (rs.next()) {
				all.add(new majorcountDTO(rs.getString(1), rs.getString(2)));
				System.out.println(rs.getString(1) + ", " + rs.getString(2));
			}
		}finally {
			DBUtil.close(con,ps, rs);
		}
		return all;
	}
}
