package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import model.MemberDAO;

@WebServlet("/MemberIdCheckAction")
public class MemberIdCheckAction extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.print("result\n");
		duplicationcheck(request,response);
	}
	
	/*
	 * 회원가입 시 아이디 중복을 확인.
	 * 
	 * */
	/*protected void duplicationcheck(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		MemberDAO dao = new MemberDAO();
	}*/
	
	protected void duplicationcheck(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		MemberDAO dao = new MemberDAO();
		System.out.println("controler에서                        " + id);
		try {
			
			boolean result = MemberDAO.duplicateIdCheck(id);
			System.out.print("있다없다"+result);
			if(result) { //true일 경우  --> 아이디가 중복된다.
				request.setAttribute("check","1"/*"아이디가 중복되어 사용이 불가능합니다."*/);
				request.getRequestDispatcher("jsp/temp.jsp").forward(request, response);
			}
			else { //false일 경우 -->아이디 사용 가능
				request.setAttribute("check","0"/*"사용가능한 아이디입니다."*/);
				request.getRequestDispatcher("jsp/temp.jsp").forward(request, response);
			}
			//return null;
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", "데이터베이스에 접근 못했습니다.");
		}
	}
}
