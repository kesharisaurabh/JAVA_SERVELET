package Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.driver.OracleDriver;


public class RegisServle extends HttpServlet {
	
	

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Connection established");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			System.out.println("Connection Established");
			PreparedStatement pstm=con.prepareStatement("insert into AStudent values(?,?,?)");
			pstm.setString(1, name);
			pstm.setString(2, email);
			pstm.setString(3, phone);
			int oval=pstm.executeUpdate();
			if(oval!=0) {
				out.println("Regidtration Successful");
			}else
				{out.println("Registration Unsuccessful");}
		}
		catch (SQLException | ClassNotFoundException e) 
		{
			System.out.println("Faild ON driver Front");
			e.printStackTrace();
		}
	}

}
