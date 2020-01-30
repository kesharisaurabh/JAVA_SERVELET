package getServletContext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class servlet3 extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw=res.getWriter();
		HttpSession hs=req.getSession();
		String per=req.getParameter("perc");
		String qual=req.getParameter("qual");
		String name=(String) hs.getAttribute("name");
		String fname=(String)hs.getAttribute("fname");
		String lname=(String)hs.getAttribute("lname");
		String cont=(String)hs.getAttribute("contact");
		String email=(String)hs.getAttribute("email");
		String addr=(String)hs.getAttribute("address");
		
		pw.println(per);
		pw.println(qual);
		pw.println(name);
		pw.println(fname);
		pw.println(lname);
		pw.println(cont);
		pw.println(email);
		pw.println(addr);
	}
}
