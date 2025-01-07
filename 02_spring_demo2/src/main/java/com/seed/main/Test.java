package com.seed.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.seed.bean.Car;
import com.seed.bean.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee e1 = (Employee) context.getBean("emp");
		Employee e2 = context.getBean("emp", Employee.class);
		e1.display();
		e2.display();
		System.out.println(e1 == e2);
		
		Car car = context.getBean("car", Car.class);
		System.out.println(car);

	}

	public static void javaExp() {
		System.out.println("main start...");

		int a = 10;
		int b = 10;
		System.out.println(a == b);

		Employee emp1 = new Employee(1, "Jack", 1000);
		Employee emp2 = new Employee(1, "Jack", 1000);
		System.out.println("emp1== emp2   => " + (emp1 == emp2));
		System.out.println("emp1.equals(emp2)  =>" + (emp1.equals(emp2)));
	}

}
