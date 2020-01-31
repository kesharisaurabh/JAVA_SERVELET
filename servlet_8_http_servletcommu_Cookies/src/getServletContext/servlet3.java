package getServletContext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class servlet3 extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw=res.getWriter();
		Cookie ck[]=req.getCookies();
		String per=req.getParameter("perc");
		String qual=req.getParameter("qual");
		
		pw.println(per);
		pw.println(qual);
		pw.println(ck[0].getValue());
		pw.println(ck[1].getValue());
		pw.println(ck[2].getValue());
		pw.println(ck[3].getValue());
		pw.println(ck[4].getValue());
		pw.println(ck[5].getValue());
	}
}
