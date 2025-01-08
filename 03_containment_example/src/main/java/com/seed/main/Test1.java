package com.seed.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed.bean.Car;
import com.seed.bean.Employee;
import com.seed.bean.Engine;

public class Test1 {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//javaExample();
		
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println(emp);
		
		Engine e1 = context.getBean("engine1", Engine.class);
		Engine e2 = context.getBean("engine2", Engine.class);
		System.out.println(e1);
		System.out.println(e2);
	}
	
	
	public static void javaExample() {
		Engine engine = new Engine();
		engine.setType("Four stroke engine");
		engine.setFuelType("PETROL");
		
		Car car = new Car();
		car.setName("BMW");
		car.setColor("white");
		car.setEngine(engine);
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Jessica");
		emp.setSalary(5000);
		emp.setVehicle(car);
		
		System.out.println(emp);
	}

}
