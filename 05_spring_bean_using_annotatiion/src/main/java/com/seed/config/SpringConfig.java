package com.seed.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.seed.bean.Employee;

public class SpringConfig {

	@Scope("prototype")
	@Bean()
	public Employee emp1() { // method name willbe the name of the bean
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("jack");
		emp.setSalary(5000.0);
		return emp;
	}

	@Bean()
	public Employee emp2() { // method name willbe the name of the bean
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("Jessica");
		emp.setSalary(15000.0);
		return emp;
	}
}
