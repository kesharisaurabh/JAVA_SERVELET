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

public class myfilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
PrintWriter pw=response.getWriter();
		
		String cons=fConfig.getInitParameter("Const");
		if(cons.equals("no")) {
			System.out.println("Bad Choice");
		}
		else {
			chain.doFilter(request, response);
		}
	}
	FilterConfig fConfig;
	public void init(FilterConfig fConfig) throws ServletException {
		this.fConfig=fConfig;
	}

}
