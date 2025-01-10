package com.seed.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed.bean.Bike;
import com.seed.bean.Car;
import com.seed.bean.Employee;


public class Test1 {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Employee emp1 = context.getBean("emp", Employee.class);
		Employee emp2 = context.getBean("emp", Employee.class);
		boolean isEmpSame = emp1 == emp2;
		System.out.println("isEmpSame: "+isEmpSame);
		System.out.println();
		
		
		//bike bean is set as prototype
		Bike bike1 = context.getBean("bike",Bike.class);  
		Bike bike2 = context.getBean("bike",Bike.class);
		boolean isBikeSame = bike1 == bike2;
		System.out.println("isBikeSame: "+isBikeSame);
		System.out.println();
		
		
		//car bean is set as singleton
		Car car1 = context.getBean("car",Car.class);
		Car car2 = context.getBean("car",Car.class);
		boolean isCarSame = car1 == car2;
		System.out.println("isCarSame: "+isCarSame);
		

	}
	
	
	

}
