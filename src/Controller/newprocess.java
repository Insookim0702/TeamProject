package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.jspbean;
import model.MemberDAO;

/**
 * Servlet implementation class newprocess
 */
@WebServlet("/newprocess")
public class newprocess extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("회원가입서버를 실행합니다.");
		jspbean bean = new jspbean();
		bean.setId(request.getParameter("id"));
		bean.setPwcheck(request.getParameter("pwcheck"));
		bean.setName(request.getParameter("name"));
		bean.setbirth(request.getParameter("birth"));
		bean.setDepartment(request.getParameter("department"));
		
		//데이터베이스 객체 선언 후 저장
		//데이터베이스 객체 생성
		
		MemberDAO mdao = new MemberDAO();
		System.out.println("DB에 접속했습니다..");
		mdao.insertMember(bean);
		System.out.println("DB에 내용을 저장했습니다..");
		RequestDispatcher dis = request.getRequestDispatcher("jsp/login.jsp");
		dis.forward(request, response); 
	}

}
