package com.seed.bean;

public class Address {
	
	private String city;
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "city ="+city;
	}

}
