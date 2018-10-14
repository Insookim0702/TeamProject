package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.corba.se.impl.protocol.giopmsgheaders.RequestMessage;

import model.loginlogoutDAO;
@WebServlet("/loginlogout")
public class loginlogout extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = request.getParameter("command");
		if(command.equals("login")) {
			login(request, response);
		}else if(command.equals("logout")) {
			logout(request, response);
		}
	}
	
	/********************로그인 처리 메소드**************************/
	protected void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		String pwcheck = request.getParameter("pwcheck");
		if (id != null && pwcheck != null) {
			try {
				System.out.println("loginlogout.servlet : DB에 접속을 시도합니다.");
				String name = loginlogoutDAO.loginCheck(id, pwcheck);
				
				if (name != null) {
					HttpSession session = request.getSession();
					System.out.println("loginlogout.servlet : 로그인 아이디에 세션을 부여합니다.");
					session.setAttribute("name", name);
					response.sendRedirect("registerController?command=reload");
					//request.getRequestDispatcher("form.jsp");
					System.out.println("loginlogout.servlet : 로그인 처리를 무사히 완료하였습니다.");
				}else {
					request.setAttribute("msg", "일치하는 정보가 없습니다.");
					request.getRequestDispatcher("jsp/msgView.jsp").forward(request, response);
				}
			}catch (Exception e) {
				e.printStackTrace();
				request.setAttribute("errorMsg", "DB에 접근하지 못했습니다.");
				request.getRequestDispatcher("error/errorView.jsp").forward(request, response);
			}
		}else {
			response.sendRedirect("login.jsp");
		}

	}
	/******************로그아웃 처리 메소드****************************/
	protected void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//이미 존재할 경우 반환
		HttpSession session = request.getSession();
		session.invalidate();
		session = null;
		response.sendRedirect("registerController?command=reload");
	}
}
