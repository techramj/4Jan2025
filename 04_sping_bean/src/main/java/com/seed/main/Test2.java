package com.seed.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed.bean.Employee;

public class Test2 {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("Employee as Prototype and Address as prototype");
		Employee emp1 = context.getBean("emp1", Employee.class);
		Employee emp2 = context.getBean("emp1", Employee.class);
		boolean isEmpSame = emp1 == emp2;
		boolean isAddressSame = emp1.getAddress() == emp2.getAddress();
		System.out.println("isEmpSame= "+isEmpSame);
		System.out.println("isAddressSame: "+isAddressSame);
		
		System.out.println("\n");
		
		
		System.out.println("Employee as Singleton and Address as singleton");
		Employee emp3 = context.getBean("emp2", Employee.class);
		Employee emp4 = context.getBean("emp2", Employee.class);
		isEmpSame = emp3 == emp4;
		isAddressSame = emp3.getAddress() == emp4.getAddress();
		System.out.println("isEmpSame= "+isEmpSame);
		System.out.println("isAddressSame: "+isAddressSame);
		
		
		System.out.println("\n\nEmployee as prototype and Address as singleton");
		Employee emp5 = context.getBean("emp3", Employee.class);
		Employee emp6 = context.getBean("emp3", Employee.class);
		isEmpSame = emp5 == emp6;
		isAddressSame = emp5.getAddress() == emp6.getAddress();
		System.out.println("isEmpSame= "+isEmpSame);
		System.out.println("isAddressSame: "+isAddressSame);
		
		
		
		System.out.println("\n\nEmployee as Singleton and Address as prototype");
		Employee emp7 = context.getBean("emp4", Employee.class);
		Employee emp8 = context.getBean("emp4", Employee.class);
		isEmpSame = emp7 == emp8;
		isAddressSame = emp7.getAddress() == emp8.getAddress();
		System.out.println("isEmpSame= "+isEmpSame);
		System.out.println("isAddressSame: "+isAddressSame);
		
	}

}
