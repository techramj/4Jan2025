package com.seed.pkg1;

public class Car extends Vehicle{
	
	private String name;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "   car ="+name;
	}
	
	

}
