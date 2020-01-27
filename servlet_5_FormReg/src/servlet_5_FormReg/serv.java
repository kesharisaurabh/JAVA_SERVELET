package servlet_5_FormReg;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import oracle.jdbc.driver.OracleDriver;


public class serv extends GenericServlet 
{
	private Connection con;
	
	@Override
	public void init(ServletConfig config) throws ServletException 
	{
		String str1=config.getInitParameter("username");
		String str2=config.getInitParameter("password");
		System.out.println(str1);
		System.out.println(str2);
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",str1,str2);
			System.out.println("ConnectionEstablished");
			
		} catch (ClassNotFoundException | SQLException e) 
		{
			System.out.println("ConnectionEstablished Faild");
			e.printStackTrace();
		}
	}
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		
		String name=req.getParameter("name");
		String addr=req.getParameter("address");
		int age=Integer.parseInt(req.getParameter("age"));
		
		
		try {
			PreparedStatement pstm=con.prepareStatement("insert into ASTUDENT values(?,?,?)");
			pstm.setString(1, name);
			pstm.setString(2, addr);
			pstm.setInt(3, age);
			int val=pstm.executeUpdate();
			if(val!=0)
			{
				System.out.println("Student Reg success");
			}else {
				System.out.println("student Reg Faild");
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
