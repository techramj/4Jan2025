package com.seed.bean;

public class Car {
	private String name;
	private String color;
	private Engine engine;
	
	public Car() {

	}

	public Car(Engine engine) {
		System.out.println("car contructor called");
		this.engine = engine;
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
	
	public Engine getEngine() {
		return engine;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + "]";
	}
	
	

}
