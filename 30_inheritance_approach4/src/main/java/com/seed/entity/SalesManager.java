package com.seed.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sales_manager7")
public class SalesManager extends Manager{
	
	@Column(name="sales_amount")
	private double salesMade;
	
	@Column(name="comm")
	private double commission;
	
	public SalesManager() {
		// TODO Auto-generated constructor stub
	}
	
	

	public SalesManager(String name, double salary, int noOfSub, double sales, double comm) {
		super(name, salary, noOfSub);
		this.salesMade = sales;
		this.commission = comm;
	}

	public double getSalesMade() {
		return salesMade;
	}

	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	

}
