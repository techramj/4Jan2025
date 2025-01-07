package com.seed.bean;

public class Engine {
	
	private String type;
	private String fuelType;
	
	public Engine() {
		System.out.println("default engine contructor...");
	}

	public Engine(String type, String fuelType) {
		System.out.println("Parameterized engine construotr");
		this.type = type;
		this.fuelType = fuelType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + ", fuelType=" + fuelType + "]";
	}
	
	

}
