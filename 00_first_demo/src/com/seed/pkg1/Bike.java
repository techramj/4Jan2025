package com.seed.pkg1;

public class Bike extends Vehicle{
	
	
private String name;
	
	public Bike() {
		// TODO Auto-generated constructor stub
	}
	
	public Bike(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " bike ="+name;
	}

}
