package demo;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

public class registration extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    public registration() 
    {
        System.out.println("Registration Const");
    }
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Registration Service");
	}
	@Override
	public void init(ServletConfig config) throws ServletException 
	{
		System.out.println("Registration Init");
	}
	@Override
	public void destroy() 
	{
		System.out.println("Registration Distroy");
	}

}
