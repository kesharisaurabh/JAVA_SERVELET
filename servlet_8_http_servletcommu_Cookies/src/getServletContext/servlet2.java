package getServletContext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class servlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw=res.getWriter();
		
		String cont=req.getParameter("contact");
		String email=req.getParameter("email");
		String addr=req.getParameter("address");
		Cookie ck1=new Cookie("contact", cont);
		Cookie ck2=new Cookie("email", email);
		Cookie ck3=new Cookie("address", addr);
		res.addCookie(ck1);
		res.addCookie(ck2);
		res.addCookie(ck3);
		RequestDispatcher rd=req.getRequestDispatcher("NewFile3.html");
		rd.include(req, res);
	}
}
