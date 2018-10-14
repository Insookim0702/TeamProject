package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;import domain.majorcountDTO;
import model.grahpDAO;

/**
 * Servlet implementation class grahpController
 */
@WebServlet("/grahpController")
public class grahpController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		majorgraphdata(request,response);
	}
	
	/*
	 * 전공 별 사용 횟수 서버 라우터
	 */
	private void majorgraphdata(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String url = "jsp/errorViemajorcountDTO";
		try{
			ArrayList<majorcountDTO> majordata = grahpDAO.totalMajor();
			if(majordata.size()!=0) {
				request.setAttribute("allData", majordata);
				url = "js/majorgrahp.js";
			}else {
				request.setAttribute("msg", "사용 내역이 없습니다....");
				url = "jsp/msgView.jsp";
			}
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", "죄송합니다. 다시 시도해 주세요..");
		}
		request.getRequestDispatcher(url).forward(request, response);
	}
}
