package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/choice")
public class servetcalculator extends GenericServlet 
{
	public void service(ServletRequest req, ServletResponse res)throws 
	ServletException,IOException
	{
		String s1 = req.getParameter("s1");
		if(s1.equals("Add"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("Add");
			rd.forward(req, res);
		}
		else if(s1.equals("Sum"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("Sub");
			rd.forward(req, res);
		}
		else if(s1.equals("Mul"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("Mul");
			rd.forward(req, res);
		}
		else if(s1.equals("Div"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("Div");
			rd.forward(req, res);
		}
		
	
	}
}
