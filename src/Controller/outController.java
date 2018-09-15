package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.outDAO;

/**
 * Servlet implementation class outController
 */
@WebServlet("/outController")
public class outController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String command =request.getParameter("command");
			if(command.equals("out1")) {
				out1(request, response);
			}else if(command.equals("out2")) {
				out2(request, response);
			}else if(command.equals("out3")) {
				out3(request, response);
			}else if(command.equals("out4")) {
				out4(request, response);
			}else if(command.equals("out5")) {
				out5(request, response);
			}else if(command.equals("out6")) {
				out6(request, response);
			}else if(command.equals("out7")) {
				out7(request, response);
			}else if(command.equals("out8")) {
				out8(request, response);
			}else if(command.equals("out9")) {
				out9(request, response);
			}
	}
	private void out1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			outDAO dao =new outDAO();
			dao.outregister1();
			request.getRequestDispatcher("/registerController?command=reload").forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg","죄송합니다. 잠시 후에 재 실행해 주세요.");
		}
	}
	private void out2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			outDAO dao =new outDAO();
			dao.outregister2();
			request.getRequestDispatcher("/registerController?command=reload").forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg","죄송합니다. 잠시 후에 재 실행해 주세요.");
		}
	}
	private void out3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			outDAO dao =new outDAO();
			dao.outregister3();
			request.getRequestDispatcher("/registerController?command=reload").forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg","죄송합니다. 잠시 후에 재 실행해 주세요.");
			request.getRequestDispatcher("jsp/errorView.jsp").forward(request, response);
		}
	}
	private void out4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			outDAO dao =new outDAO();
			dao.outregister4();
			request.getRequestDispatcher("/registerController?command=reload").forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg","죄송합니다. 잠시 후에 재 실행해 주세요.");
		}
	}
	private void out5(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			outDAO dao =new outDAO();
			dao.outregister5();
			request.getRequestDispatcher("/registerController?command=reload").forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg","죄송합니다. 잠시 후에 재 실행해 주세요.");
		}
	}
	private void out6(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			outDAO dao =new outDAO();
			dao.outregister6();
			request.getRequestDispatcher("/registerController?command=reload").forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg","죄송합니다. 잠시 후에 재 실행해 주세요.");
		}
	}
	private void out7(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			outDAO dao =new outDAO();
			dao.outregister7();
			request.getRequestDispatcher("/registerController?command=reload").forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg","죄송합니다. 잠시 후에 재 실행해 주세요.");
		}
	}
	private void out8(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			outDAO dao =new outDAO();
			dao.outregister8();
			request.getRequestDispatcher("/registerController?command=reload").forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg","죄송합니다. 잠시 후에 재 실행해 주세요.");
		}
	}
	private void out9(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			outDAO dao =new outDAO();
			dao.outregister9();
			request.getRequestDispatcher("/registerController?command=reload").forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg","죄송합니다. 잠시 후에 재 실행해 주세요.");
		}
	}

}
