package com.seed.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="manager7")
public class Manager extends Employee {
	
	@Column(name="no_of_sub")
	private int noOfSub;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	public Manager(String name, double salary, int noOfSub) {
		super(name,salary);
		this.noOfSub = noOfSub;
	}

}
