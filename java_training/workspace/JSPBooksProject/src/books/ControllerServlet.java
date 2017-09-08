package books;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javabean.LoginBean;

public class ControllerServlet extends HttpServlet {

	ServletContext ctx;
	LoginBean loginBean;
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		
		String strForward=request.getParameter("forward");
		RequestDispatcher rd=null;
		
		if("authenticate".equals(strForward))
		{
			loginBean=new LoginBean(request.getParameter("uname"), request.getParameter("password"));
			if(loginBean.login())
			{
				HttpSession session=request.getSession(true);
				session.setAttribute("uname", request.getParameter("uname"));
				rd=request.getRequestDispatcher("/computerbooks.jsp");
				rd.forward(request, response);
			}
			else
			{
				
				rd=request.getRequestDispatcher("/login.jsp");
				rd.forward(request, response);
			}
			
		}
		else if("computerBooks".equals(strForward))
		{
			
			
			rd=request.getRequestDispatcher("/historybooks.jsp");
			rd.forward(request, response);
		}
		
		else if("historyBooks".equals(strForward))
		{
			rd=request.getRequestDispatcher("/shoppingcart.jsp");
			rd.forward(request, response);
		}
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		doGet(request, response);
	}
}
