package pkg;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


public class filter1 implements Filter {

	public void destroy()
	{
		System.out.println("Filter_Distrory");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		System.out.println("doFilter_Before");
		chain.doFilter(request, response);
		System.out.println("doFilter_After");
	}
	
	public void init(FilterConfig fConfig) throws ServletException 
	{
		System.out.println("Filter_Init");
	}

}
