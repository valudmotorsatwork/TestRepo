package com.sarang.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {

	
	static final String driver = "oracle.jdbc.driver.OracleDriver";
	static final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	static final String username = "system";
	static final String password = "manager";

	public static Connection oracleConnect() throws ClassNotFoundException, SQLException{
		Class.forName(driver);
		return DriverManager.getConnection(url,username,password);
	}
	
}
