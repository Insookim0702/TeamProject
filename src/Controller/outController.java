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
			out(request, response);
	}
	
	private void out(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num;
		try {
			outDAO dao =new outDAO();
			num = request.getParameter("bednum");
			switch(num) {
			
			case "1":	dao.outdao("1");	break;
			case "2":	dao.outdao("2");	break;
			case "3":	dao.outdao("3");	break;
			case "4":	dao.outdao("4");	break;
			case "5":	dao.outdao("5");	break;
			case "6":	dao.outdao("6");	break;
			case "7":	dao.outdao("7");	break;
			case "8":	dao.outdao("8");	break;
			case "9":	dao.outdao("9");	break;
			default:	System.out.println("형식이 올바르지 않습니다.");
			}
			
			request.getRequestDispatcher("/registerController?command=reload").forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg","죄송합니다. 잠시 후에 재 실행해 주세요.");
		}
	}
}
