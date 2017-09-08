package books;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ComputerBooksServlet extends HttpServlet{
	
	

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		HttpSession session=request.getSession();
		String username=session.getAttribute("uname").toString();
		PrintWriter out=response.getWriter();
		out.println(
						"<html><body>"+ 
						"<h1>Welcome "+username+ "</h1>"+ 
						"<h3>Computer Books</h3><br>" +
						"<form action='controller?forward=computerBooks' method='POST'>"+
						"<input type='checkbox' name='computerbooks' value='C'>C<br>"+
						"<input type='checkbox' name='computerbooks' value='C++'>C++<br>"+
						"<input type='checkbox' name='computerbooks' value='Java'>Java<br>"+
						"<input type='submit' value='NEXT'>"+
						"</form>"+
						"</body></html>"
				   );
		
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		doGet(request,response);
	}

}
