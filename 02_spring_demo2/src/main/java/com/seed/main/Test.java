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
		
		int a = 10;
		int b = 10;
		System.out.println(a==b);
		
		Employee emp1 = new Employee(1, "Jack", 1000);
		Employee emp2 = new Employee(1, "Jack", 1000);
		System.out.println(emp1  == emp2);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(context.getClass());
		Employee e1 = (Employee)context.getBean("emp");
		Employee e2 = context.getBean("emp", Employee.class);
		e1.display();
		e2.display();
		System.out.println(e1 == e2);
	
		
	
		
	}

}
