package com.seed.bean;

import java.util.Objects;

public class Employee {
	
	private int id;
	private String name;
	private double salary;  
	private Vehicle vehicle;
	
	public Employee() {
		System.out.println("default constructor called");
	}
	
	public Employee(int id, String name, double salary) {
		System.out.println("parameterized employee constructor with 3 parameter called...");
		this.id = id;
		this.name = name;
	    this.salary = salary;
	}
	
	public Employee(int id, String name, double salary,  Vehicle vehicle) {
		System.out.println("parameterized employee constructor with 4 parameter called...");
		this.id = id;
		this.name = name;
	    this.salary = salary;
	    this.vehicle = vehicle;
	}
	
	
	public void display() {
		System.out.println(toString());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		int x = 10;  //x is local variable
		return "id=" + id + ", name=" + name + ", salary=" + salary + ", Vehicle="+vehicle ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	
	

}
