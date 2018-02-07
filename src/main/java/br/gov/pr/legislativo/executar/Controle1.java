package br.gov.pr.legislativo.executar;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controle1")
public class Controle1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String val = request.getParameter("numero");
		System.out.println(val);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String val = request.getParameter("numero");
		int valor = Integer.parseInt(val);
		String resultado="";
		if(valor%2==0){
			resultado = "par";
		}else{
			resultado = "impar";
		}
		//String resultado = (valor%2==0) ? "par" : "ímpar";
		request.setAttribute("res", resultado);
		request.getRequestDispatcher("primeiroJsp.jsp").forward(request, response);
		
	}

}
