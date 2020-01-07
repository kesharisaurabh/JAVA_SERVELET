package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

public class demoServ extends GenericServlet {
	private static final long serialVersionUID = 1L;
    public demoServ() {
        super();
    }
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String str1=req.getParameter("p1");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("Hello "+str1);
	}

}
