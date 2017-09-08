package books;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet {
	
	ServletContext ctx;
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String strForward=request.getParameter("forward");
		RequestDispatcher rd=null;
		
		if("authenticate".equals(strForward))
		{
			rd=this.ctx.getRequestDispatcher("/login");
		}
	}

}
