package com.seed;

import java.sql.Connection;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.seed.entity.Employee;
import com.seed.service.EmployeeService;

public class Main {
	
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmsApplicationConfig.class);
		
		EmployeeService empService = context.getBean("employeeServiceImpl", EmployeeService.class);
		
		empService.addEmployee(new Employee(20, "Sameer", 5000, 5));
		empService.updateEmployeeDetails(new Employee(2,"SAM",50000,5));
		empService.deleteEmployee(3);
		List<Employee> employees = empService.getAllEmployeesDetails();
		employees.forEach(System.out::println);
		
	}
	
	public static void printBeanName(ApplicationContext context) {
		for(String bean: context.getBeanDefinitionNames()) {
			System.out.println(bean);
		}
	}

}
