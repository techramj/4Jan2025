package com.seed;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.seed.service.EmployeeService;

public class Main {
	
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmsApplicationConfig.class);
		
		EmployeeService empService = context.getBean("employeeServiceImpl", EmployeeService.class);
		empService.addEmployee(null);
		
		//printBeanName(context);
	}
	
	public static void printBeanName(ApplicationContext context) {
		for(String bean: context.getBeanDefinitionNames()) {
			System.out.println(bean);
		}
	}

}
