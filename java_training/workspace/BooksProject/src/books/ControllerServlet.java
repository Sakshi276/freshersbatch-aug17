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

public class ControllerServlet extends HttpServlet {

ServletContext ctx;
String selectedBooks[];

	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		HttpSession session=request.getSession();
		String strForward=request.getParameter("forward");
		RequestDispatcher rd=null;
		
		if("authenticate".equals(strForward))
		{
			rd=request.getRequestDispatcher("/login");
			rd.forward(request, response);
		}
		else if("computerBooks".equals(strForward))
		{
			selectedBooks=request.getParameterValues("computerbooks");
			List<String> books=new ArrayList<String>();
			for(String book : books)
			{
				books.add(book);
			}
			session.setAttribute("cbooks", books);
			
			rd=request.getRequestDispatcher("/historyBooks");
			rd.forward(request, response);
		}
		else if("historyBooks".equals(strForward))
		{
			rd=request.getRequestDispatcher("/shoppingCart");
			rd.forward(request, response);
		}
		else if("logout".equals(strForward))
		{
			rd=request.getRequestDispatcher("/logout");
			rd.forward(request, response);
		}
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		doGet(request, response);
	}
}
