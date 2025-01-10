package com.seed.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed.bean.Employee;
import com.seed.config.SpringConfig;

public class Test1 {
	
	public static void main(String[] args) {
	
		usingAnnoation();ApplicationContext context = new AnnotationConfigApplicationContext();
		
	}
	
	public static void usingAnnoation() {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println("context= "+context);
		
		Employee emp1 = context.getBean("emp1", Employee.class);
		Employee emp2 = context.getBean("emp1", Employee.class);
		System.out.println(emp1 == emp2);
		System.out.println(emp2);
		
		Employee emp3 = context.getBean("emp2", Employee.class);
		Employee emp4 = context.getBean("emp2", Employee.class);
		System.out.println(emp3 == emp4);
		System.out.println("emp3 ="+emp3);
		System.out.println("emp4 ="+emp4);
	
	}
	
	
	
	public static void usingXml() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	}

}
