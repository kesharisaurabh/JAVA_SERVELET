package servForm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class servlethttp extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw=res.getWriter();
		HttpSession hs=req.getSession();
		String fn=req.getParameter("fno");
		System.out.println(fn);
		if(fn.equals("1"))
		{
			String name=req.getParameter("name");
			String fname=req.getParameter("fname");
			String lname=req.getParameter("lname");
			hs.setAttribute("name", name);
			hs.setAttribute("fname", fname);
			hs.setAttribute("lname", lname);
			res.sendRedirect("./NewFile2");		
			System.out.println(fn);
		}
		if(fn.equals("2"))
		{
			String cont=req.getParameter("contact");
			String email=req.getParameter("email");
			String addr=req.getParameter("address");
			hs.setAttribute("contact", cont);
			hs.setAttribute("email", email);
			hs.setAttribute("address", addr);
			res.sendRedirect("./NewFile3");
		}
		if(fn.equals("3"))
		{
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

	

}
