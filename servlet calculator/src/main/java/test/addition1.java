package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/Add")
public class addition1 extends GenericServlet
{
	public void service(ServletRequest req, ServletResponse res)throws 
	ServletException,IOException
	{
		int x = Integer.parseInt(req.getParameter("v1"));
		int y = Integer.parseInt(req.getParameter("v2"));
		int z = x+y;
		PrintWriter pw = res.getWriter();
		pw.println("sum is "+z+"<br>");
	}
}
