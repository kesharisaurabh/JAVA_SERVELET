package getServletContext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class servlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw=res.getWriter();
		HttpSession hs=req.getSession();
		String cont=req.getParameter("contact");
		String email=req.getParameter("email");
		String addr=req.getParameter("address");
		hs.setAttribute("contact", cont);
		hs.setAttribute("email", email);
		hs.setAttribute("address", addr);
		RequestDispatcher rd=req.getRequestDispatcher("NewFile3.html");
		rd.include(req, res);
	}
}
