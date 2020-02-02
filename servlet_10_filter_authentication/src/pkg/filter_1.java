package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

public class filter_1 implements Filter {

	public void destroy()
	{
	
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		PrintWriter pw=response.getWriter();
		String usn=request.getParameter("name");
		String psw=request.getParameter("password");
		pw.print(usn);
		pw.print(psw);
		System.out.println(usn);
		System.out.println(psw);
		if((usn.equals("saurabh"))&&(psw.equals("keshari")))
		{
			System.out.println("Welcome");
			chain.doFilter(request, response);
			System.out.println("Thanku Will hope U come Back");
		}else {
			System.out.println("ERROR");
			
//			RequestDispatcher rd=request.getRequestDispatcher("err.html");
//			rd.include(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException
	{
		
	}

}
