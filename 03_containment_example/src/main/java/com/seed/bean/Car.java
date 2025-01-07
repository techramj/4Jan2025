package com.seed.bean;

public class Car extends Vehicle{
	private String name;
	private String color;
	private Engine engine;
	
	public Car() {
	
	}

	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public Car(String name, String color, Engine engine) {
		this.name = name;
		this.color = color;
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
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + " , "+ engine;
	}
	
	

}
