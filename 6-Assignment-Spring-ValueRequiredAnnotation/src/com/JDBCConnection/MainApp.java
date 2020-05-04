package com.JDBCConnection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		JDBCConnection connection = context.getBean("con", JDBCConnection.class);
		connection.displayInfo();
		
		connection.getJDBCConnection();

	}

}
