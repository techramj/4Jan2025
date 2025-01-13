package com.seed.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed.bean.Employee;
import com.seed.bean.controller.EmployeeController;

public class Test2 {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//displayBeans(context);
		
		EmployeeController empController = context.getBean("empController", EmployeeController.class);
		System.out.println("service: "+empController.getEmployeeService());
		System.out.println("dao:" + empController.getEmployeeService().getEmployeeDao());


	}
	
	public static void displayBeans(ApplicationContext context) {
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for(String bean:beanDefinitionNames) {
			System.out.println(bean);
		}
	}
	
	

}
