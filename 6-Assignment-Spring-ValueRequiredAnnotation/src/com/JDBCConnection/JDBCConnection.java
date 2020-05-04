package com.JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection {
	@Value("${mysql.username}") // injecting the values from properties file
	private String userName;
	
	@Value("${mysql.passwor}")
	private String password;
	
	@Value("${msql.url}")
	private String url;
	
	@Value("${mysql.driver}")
	private String driver;
	
	public void displayInfo()
	{
		System.out.println("User Name: "+userName);
		System.out.println("Password: "+password);
		System.out.println("URL: "+url);
		System.out.println("Driver: "+driver);
	}
	
	public void getJDBCConnection() throws Exception
	{
		Class.forName(driver);
		Connection myCon = DriverManager.getConnection(url, userName, password);
		System.out.println("\nConnection Sucessful: "+ myCon);
	}

}
