package com.sistemi.informativi.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionSingleton {
	
	
	private static Connection connection;
	
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		
		
		if (connection==null) {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 connection  = DriverManager.getConnection(
					DbParameters.dbUrl.getValue(),
					DbParameters.dbUser.getValue(),
					DbParameters.dbPass.getValue());
		}
		
	return connection;
	
	}
	
	
	private ConnectionSingleton() {
		
	}

}
