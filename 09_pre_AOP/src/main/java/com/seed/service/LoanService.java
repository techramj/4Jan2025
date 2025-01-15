package com.seed.service;

import java.time.LocalDateTime;
import java.util.Date;

public class LoanService {
	
	public void issueLoan(String customerId) {
		//logging
		System.out.println("Entered: LoanService.issueLoan at "+ LocalDateTime.now());
		System.out.println("Loan issued to customer "+customerId);
		System.out.println("Exit: LoanService.issueLoan at "+ LocalDateTime.now());
	}
	
	public void payDue(String customerId) {
		//logging
		System.out.println("Entered: LoanService.payDue at "+ LocalDateTime.now());
		
		//transaction
		System.out.println("begin transaction");
		try {
			
			System.out.println("pending due is clear for customer "+customerId);
			System.out.println("Deleting the customer entry from loan Account");
			System.out.println("commit");
		}catch(Exception e) {
			System.out.println("rollback");
		}
		System.out.println("Exit: LoanService.payDue at "+ LocalDateTime.now());
		
	}

}
