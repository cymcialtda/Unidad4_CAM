package com.lds;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ervlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String[] urlArr = System.getProperties().toString().split(",");
		String cadena = "PROPIEDADES DEL SISTEMA<br><br><br>";
		for (int i = 0; i < urlArr.length; i++){
		    cadena += i + "):" + urlArr[i] + "<br>";
		}
        response.getWriter().print(cadena);
	}
}
