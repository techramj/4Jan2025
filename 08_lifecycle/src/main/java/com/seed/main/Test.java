package com.seed.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.seed.bean.Car;
import com.seed.bean.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee e1 = (Employee) context.getBean("emp");
		System.out.println("......bean is ready to use..."+e1);
		((ConfigurableApplicationContext)context).registerShutdownHook();
		

	}


}
