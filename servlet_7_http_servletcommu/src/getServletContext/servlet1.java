package getServletContext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Registration;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class servlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw=res.getWriter();
		HttpSession hs=req.getSession();
		String name=req.getParameter("name");
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		hs.setAttribute("name", name);
		hs.setAttribute("fname", fname);
		hs.setAttribute("lname", lname);
		pw.println(name);
		RequestDispatcher rd= req.getRequestDispatcher("./NewFile2.html");
		rd.include(req, res);
	}
}
