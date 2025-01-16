package com.seed.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed.service.LoanService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		LoanService loanService = (LoanService)context.getBean("loanService");
		
	
		loanService.payDue("10001");
		//loanService.payDue("10003");
		
		
		((ConfigurableApplicationContext)context).registerShutdownHook();
		
	}


}
