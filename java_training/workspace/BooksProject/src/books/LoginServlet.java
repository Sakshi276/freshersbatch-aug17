package books;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	ServletContext ctx;

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		String username=request.getParameter("uname");
		String password=request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher rd=null;
		
		
		if(username.equals("sakshi") && password.equals("sakshi"))
		{
			HttpSession session=request.getSession();
			session.setAttribute("uname", username);
			rd=request.getRequestDispatcher("/computerBooks");
			rd.forward(request, response);
			
		}
		else
		{
			out.println("<html><body><h1>wrong credentials</h1></body></html>");
		}
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		doGet(request,response);
	}
}
