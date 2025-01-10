package com.seed.bean;

public class Address {
	
	private String city;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	

	public Address(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "city ="+city;
	}
	

}
