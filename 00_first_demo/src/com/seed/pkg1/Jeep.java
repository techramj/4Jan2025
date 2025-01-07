package com.seed.pkg1;

public class Jeep extends Vehicle{
    private String name;
    private Engine engine;
	
	public Jeep() {
		// TODO Auto-generated constructor stub
	}
	
	public Jeep(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "   jeep ="+name;
	}
}
