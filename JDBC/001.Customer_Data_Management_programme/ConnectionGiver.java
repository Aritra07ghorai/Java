package com.aritra.customerdatamanagement.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.aritra.customerdatamanagement.appConstants.AppConstants;

public class ConnectionGiver {
	public static Connection connection = null;
	
	private ConnectionGiver() {}//Using Single Ton
	
	public static Connection getConnection() {
		if(connection == null) {
		try {
			Class.forName(AppConstants.DRIVER_NAME);
			FileInputStream fileInputStream = new FileInputStream(AppConstants.USER_DETAILS_INFO);
			Properties properties = new Properties();
			properties.load(fileInputStream);
			connection = DriverManager.getConnection(AppConstants.URL, properties);
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();	
		}
	}
	return connection;
	}
}
