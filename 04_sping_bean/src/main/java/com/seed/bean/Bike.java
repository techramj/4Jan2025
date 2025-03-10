package com.seed.bean;

public class Bike{
	private String name;
	private String color;
	
	public Bike() {
		System.out.println(this.getClass().getSimpleName()+ " default constructor called");
	
	}

	public Bike(String name, String color) {
		this.name = name;
		this.color = color;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + ", color=" + color;
	}
	
	

}
