package com.practice;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/login")
public class TestLogin extends HttpServlet {
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String username=request.getParameter("uname");
		String password=request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		if(username.equals("sakshi") && password.equals("sakshi"))
		{
			out.println("<html><body><h1>Successful login</h1></body></html>");
		}
		else
		{
			out.println("<html><body><h1>wrong credentials</h1></body></html>");
		}
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		doGet(request,response);
	}
}
