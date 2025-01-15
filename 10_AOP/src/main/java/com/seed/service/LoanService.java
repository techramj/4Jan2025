package com.seed.service;


public class LoanService {
	
	public void issueLoan(String customerId) {
		long l1 = System.currentTimeMillis();
		System.out.println("Loan issued to customer "+customerId);
		long l2 = System.currentTimeMillis();
		System.out.println("Time taken: "+ (l2-l1)/1000 +" ms");
	}
	
	public void payDue(String customerId) {

		System.out.println("pending due is clear for customer " + customerId);
		System.out.println("Deleting the customer entry from loan Account");

	}

}
