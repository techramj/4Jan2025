package com.seed.bean;

public class Car {
	private String name;
	private String color;
	
	public Car() {
		System.out.println(this.getClass().getSimpleName()+"  default constructor called...");
	}

	public Car(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println(this.getClass().getSimpleName()+"  setName method called...");
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
		return "Car [name=" + name + ", color=" + color + "]";
	}
	
	public void init() {
		
		System.out.println(this.getClass().getSimpleName()+"  init method called...");
	}
	
	
	public void carDestroy() {
		System.out.println(this.getClass().getSimpleName()+"  carDestroy method called...");
	}
	

}
