package com.yavdhesh.connectionDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MySqlConnectionServlet
 */
@WebServlet("/MySqlConnectionServlet")
public class MySqlConnectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String username="springstudent";
		String pass="springstudent";
		String connectionURL="jdbc:mysql://127.0.0.1:3306/web_customer_tracker?useSSL=false";
		String driver= "com.mysql.jdbc.Driver";
		
		try {
			
			PrintWriter pt= response.getWriter();
			Class.forName(driver);
			Connection con =DriverManager.getConnection(connectionURL, username, pass);
			
			pt.println("ho gayaa hai db judaav");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
