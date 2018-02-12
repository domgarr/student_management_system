package com.garreffd.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDatabaseConnection
 */
@WebServlet("/TestDatabaseConnection")
public class TestDatabaseConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
    final String user = "teacher-user";
    final String password = "password";
    
    /*http://www.oracle.com/technetwork/java/javase/jdbc/index.html
     * JDBC - Java Database Connectivity - is an API that allows
     * for Java  to connect to a wide variety of databases.
     * 
     * The URL to connect to our MySQL database. It is named 'hb_student_management'. Hb stands for hibernate, the framework
     * we will use to map Java objects to a relational database.
     */
    final String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_management?useSSL=false";
    
    /*
     * https://en.wikipedia.org/wiki/JDBC_driver
     * JDBC Driver is a software component enabling Java to interact with databases. 
     * It does two things gives the connection and implements a protocol for transferring queries and results
     * between client and database.
     * 
     */
    final String driver = "com.mysql.jdbc.Driver";
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out = response.getWriter();
			out.println("Attempting to connect to database: " + jdbcUrl);
			
			/*
			 * Class.forName(String) returns the class name associated with the object.
			 * What's the purpose of this line? 
			 * It doesn't aid in connecting to the database. What it does is ensure the 
			 * correct Driver class is loaded by the class loader.
			 * 
			 * https://stackoverflow.com/questions/8053095/what-is-the-actual-use-of-class-fornameoracle-jdbc-driver-oracledriver-while
			 */
			Class.forName(driver);
			
			Connection testConn = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("\nSuccesfully connected.");
			testConn.close();
		}catch(Exception e) {
			System.out.println("Error in connecting.");
			e.printStackTrace();
		}
	}

	

}
