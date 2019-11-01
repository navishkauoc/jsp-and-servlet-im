package com.navishkakularathna.testworkshop;

import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		String name = "Navishka Kularathna";
		Date today = new Date();
		
		try {
			PrintWriter out = response.getWriter();
			out.println("<h3> Name : " + name + "</h3>");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("Servlet is working");
	}
	

}
