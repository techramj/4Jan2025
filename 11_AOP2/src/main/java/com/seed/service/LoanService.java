package com.seed.service;

import org.springframework.stereotype.Component;

@Component
public class LoanService {
	
	public void issueLoan(String customerId) {
		System.out.println("Loan issued to customer "+customerId);
	}
	
	public void payDue(String customerId) {

		System.out.println("pending due is clear for customer " + customerId);
		System.out.println("Deleting the customer entry from loan Account");
		if(1== 1) {
			throw new RuntimeException();
		}

	}

}
