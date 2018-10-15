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
import model.outDAO;

/**
 * Servlet implementation class registerController
 */
@WebServlet("/registerController")
public class registerController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String command =request.getParameter("command");
			if(command.equals("register")) {
				register(request, response);
			}
			reload(request, response);
	}
	/*
	 * ===============학생 입실 시 등록 정보 DB로 전송==================
	 */
	private void register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			registerDTO dto = new registerDTO();
			dto.setId(request.getParameter("id"));
			dto.setName(request.getParameter("name"));
			dto.setPhone(request.getParameter("phone"));
			dto.setBednum(request.getParameter("bednum"));
			//데이터베이스 객체 선언 후 저장
			//데이터베이스 객체 생성
			
			DAO registerdao = new DAO();
			registerdao.insertregister(dto);
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg","죄송합니다. 잠시 후에 재 실행해 주세요.");
		}
	}
	
	/*
	 * 입실상태인 침대번호를 form.jsp에  뿌려준다.
	 */
	private void reload(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//데이터베이스에서 입실된 침대 번호 가져온다
			String bednum1 = DAO.getbednum("1");
			String bednum2 = DAO.getbednum("2");
			String bednum3 = DAO.getbednum("3");
			String bednum4 = DAO.getbednum("4");
			String bednum5 = DAO.getbednum("5");
			String bednum6 = DAO.getbednum("6");
			String bednum7 = DAO.getbednum("7");
			String bednum8 = DAO.getbednum("8");
			String bednum9 = DAO.getbednum("9");
			request.setAttribute("bednum1", bednum1);   
			request.setAttribute("bednum2", bednum2);
			request.setAttribute("bednum3", bednum3);
			request.setAttribute("bednum4", bednum4);
			request.setAttribute("bednum5", bednum5);
			request.setAttribute("bednum6", bednum6);
			request.setAttribute("bednum7", bednum7);
			request.setAttribute("bednum8", bednum8);
			request.setAttribute("bednum9", bednum9);
			request.getRequestDispatcher("form.jsp").forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg","죄송합니다. 잠시 후에 재 실행해 주세요.");
		}
	}
}
