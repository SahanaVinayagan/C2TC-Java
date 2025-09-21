package com.jdbcproject.src.usingstatement;

import java.sql.Connection;
import java.sql.SQLException;

import java.sql.Statement;

public class StatementInterfaceDemo {
	static Connection cn;

	static Statement st;
	
	static {
		cn = TestConnection.getConn();
		try {
			st =  cn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int addStudent() {

		int n = 0;
		try {

	String query = "INSERT INTO student.student values(4,'Veena')";
	n = st.executeUpdate(query);

	}
		catch (SQLException e) {

			System.out.println("Error...." + e.getMessage());
			n = 0;
		}
		return n;
	}
	
	public static void closeConnection() {
		try {
		 st.close();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
