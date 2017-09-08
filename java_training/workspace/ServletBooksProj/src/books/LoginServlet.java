package books;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet {

		
		public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
		{
			String username=request.getParameter("uname");
			String password=request.getParameter("password");
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			if(username.equals("sakshi") && password.equals("sakshi"))
			{
				
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
