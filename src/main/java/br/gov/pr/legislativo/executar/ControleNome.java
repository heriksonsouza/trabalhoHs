package br.gov.pr.legislativo.executar;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControleNome
 */
@WebServlet("/controleNome")
public class ControleNome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String nomes="";
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		nomes = nomes + request.getParameter("nome")+"<br>";
		
		request.setAttribute("lista", nomes);
		request.getRequestDispatcher("paginaNomes.jsp").forward(request, response);
	}

}
