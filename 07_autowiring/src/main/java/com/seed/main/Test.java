package com.seed.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.seed.bean.Car;
import com.seed.bean.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee e1 = context.getBean("emp1", Employee.class);
		e1.display();
		
		Employee e2 = context.getBean("emp2", Employee.class);
		e2.display();
		
		Employee e3 = context.getBean("emp3", Employee.class);
		e3.display();
		

		

	}
	




}
