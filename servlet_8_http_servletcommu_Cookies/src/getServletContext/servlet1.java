package getServletContext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Registration;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class servlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw=res.getWriter();
		
		String name=req.getParameter("name");
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		Cookie ck1=new Cookie("name", name);
		Cookie ck2=new Cookie("fname", fname);
		Cookie ck3=new Cookie("lname", lname);
		res.addCookie(ck1);
		res.addCookie(ck2);
		res.addCookie(ck3);
		
		RequestDispatcher rd= req.getRequestDispatcher("./NewFile2.html");
		rd.include(req, res);
	}
}
