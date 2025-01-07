package com.seed.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.seed.bean.Employee;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("main start...");
		
		/*Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Jack");
		emp.setSalary(5000);
		
		
		Employee emp1 = new Employee(2,"Jessica", 50000);
		
		emp1.display();
		emp.display();
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(context.getClass());
		Employee e1 = (Employee)context.getBean("emp");
		e1.display();
		
	
		
	
		
	}

}
