package books;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HistoryBooksServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		HttpSession session=request.getSession();
		String username=session.getAttribute("uname").toString();
		PrintWriter out=response.getWriter();
		out.println(
						"<html><body>"+ 
						"<h1>Welcome "+ username + "</h1>" + 
						"<h3>History Books</h3><br>" +
						"<form action='controller?forward=historyBooks' method='POST'>"+
						"<input type='checkbox' name='historybooks' value='H1'>H1<br>"+
						"<input type='checkbox' name='historybooks' value='H2'>H2<br>"+
						"<input type='checkbox' name='historybooks' value='H3'>H3<br>"+
						"<input type='submit' value='SHOW'>"+
						"</form>"+
						"</body></html>"
				   );
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		doGet(request,response);
	}

}
