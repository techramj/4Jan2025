package com.seed;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@ComponentScan(basePackages = {"com.seed"})
@Configuration
public class EmsApplicationConfig {
	
	@Bean()
	public Connection connection() throws Exception {
		try {
		String url ="jdbc:mysql://localhost:3306/hr";
		String driver ="com.mysql.cj.jdbc.Driver";
		String username = "root";
		String password = "root1234";
		
		Class.forName(driver);
		System.out.println("Driver loaded successfully");
		Connection conn =DriverManager.getConnection(url,username, password);
			return conn;
		}catch(Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	@Bean()
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/hr");
		dataSource.setUsername("root");
		dataSource.setPassword("root1234");
		return dataSource;
	}
	
	@Bean()
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(dataSource());
		return template;
	}

}
