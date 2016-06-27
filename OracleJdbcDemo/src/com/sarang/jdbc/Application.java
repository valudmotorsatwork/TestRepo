package com.sarang.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



import com.sarang.utility.JdbcUtil;

public class Application {
	
	public static void main(String args[]) {


			Connection con = null;
			Statement stmt = null;
			ResultSet rs = null;
	
		try {
			
			// Step 1 Connect to Database
			con = JdbcUtil.oracleConnect();
		
			// step3 create the statement object
			stmt = con.createStatement();
			
			System.out.println("conncection successful");
			
			// step4 execute query
			rs = stmt.executeQuery("select * from AQ$_QUEUES");
			while (rs.next()){
				System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			}
			
			// step5 close the connection object
			rs.close();
			stmt.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
