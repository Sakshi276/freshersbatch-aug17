package books;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShoppingCartServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		HttpSession session=request.getSession();
		String username=session.getAttribute("uname").toString();
		
		PrintWriter out=response.getWriter();
		out.println(
				"<html><body>"+ 
				"<h1>Welcome "+username+ "</h1><br>"+
				"<h3>Shopping Cart: <h3><br>"+
				  session.getAttribute("cbooks")  +                                                                                                                                                                    
				"<form action='controller?forward=logout' method='POST'>"+
				"<input type='submit' value='LOGOUT'>"+
				"</form>"+
				"</body></html>"		
				   );
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		doGet(request,response);
	}

}
