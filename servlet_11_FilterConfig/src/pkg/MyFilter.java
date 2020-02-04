package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;


public class MyFilter implements Filter {

	public void destroy()
	{
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		PrintWriter pw=response.getWriter();
		String val=request.getParameter("name");
		String cons=config.getInitParameter("Const");
		System.out.println(cons);
		System.out.println(val);
		if(cons.equals(val)) {
			chain.doFilter(request, response);
		}
		else {
			
			System.out.println("Bad Choice");
			pw.println("Bad Choice");
		}
		
	}
FilterConfig config;
	public void init(FilterConfig fConfig) throws ServletException 
	{
		config=fConfig;
	}

}
