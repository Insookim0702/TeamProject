package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.registerDTO;
import model.DAO;
import model.MemberDAO;


@WebServlet("/Allcontroller")
public class Allcontroller extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		//String command = request.getParameter("command");
		all(request,response);
	}
	/*
	 * 회원가입 시 아이디 중복을 확인.
	 * 
	 * */
	/*protected void duplicationcheck(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		MemberDAO dao = new MemberDAO();
	}*/
			
	//모든 고객정보 요청 및 응답 처리하는 메소드
	//로직 경우의 수
	/*1. 검색된 고객들 존재  - allView.jsp에 데이터 넘겨서 출력 
	2. 고객들이 미존재   -msgView.jsp에 출력위임
	3. 예외 발생이 된다. 모두 처리해줘야 한다. - errorView.jsp에 예외 메세지 출력 위임*/
	private void all(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url ="jsp/errorView.jsp";
		try {
			ArrayList<registerDTO> all = DAO.selectAll();
			if(all.size()!=0 ) {
				request.setAttribute("allData",all);
				url ="AllView.jsp";
				// 지정. 실제 이동
			}else {
					request.setAttribute("msg", "고객이 없습니다. ");
				url ="jsp/msgView.jsp";
			}
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg","죄송합니다. 잠시 후에 재 실행해 주세요.");
		} 
		request.getRequestDispatcher(url).forward(request, response);
	}	
}
