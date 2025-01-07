package com.seed.pkg1;

public class Employee {
	private int id;
	private String name;
	private double salary;  //instance member, data member, object member / not static variable
	//private Car car;   //containment
	//private Bike bike;
	private Vehicle vehicle;
	
	public Employee() {
		
	}
	
	/*public Employee(int id, String name, double salary, Car car) {
		this.id = id;
		this.name = name;
	    this.salary = salary;
	    this.car = car;
	}*/
	
	public Employee(int id, String name, double salary, Vehicle vehicle) {
		this.id = id;
		this.name = name;
	    this.salary = salary;
	    this.vehicle = vehicle;
	}

	
	public void display() {
		
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

	@Override
	public String toString() {
		int x = 10;  //x is local variable
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]" + vehicle ;
	}
	
	
}
