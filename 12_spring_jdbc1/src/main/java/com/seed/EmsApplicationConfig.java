package com.seed;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan(basePackages = {"com.seed"})
@Configuration
public class EmsApplicationConfig {
	
	@Bean()
	public Connection connection() throws Exception {
		try {
		String url ="jdbc:oracle:thin:@localhost:1521:XE";
		String driver ="oracle.jdbc.driver.OracleDriver";
		String username = "hr";
		String password = "hr";
		
		Class.forName(driver);
		System.out.println("Driver loaded successfully");
		Connection conn =DriverManager.getConnection(url,username, password);
			return conn;
		}catch(Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

}
