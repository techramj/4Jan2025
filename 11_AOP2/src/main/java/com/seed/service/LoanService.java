package com.seed.service;


public class LoanService {
	
	public void issueLoan(String customerId) {
		System.out.println("Loan issued to customer "+customerId);
	}
	
	public void payDue(String customerId) {

		System.out.println("pending due is clear for customer " + customerId);
		System.out.println("Deleting the customer entry from loan Account");

	}

}
