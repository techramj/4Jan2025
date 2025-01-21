package com.seed.entity;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private int yearOfExperience;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, double salary, int yearOfExperience) {
		this.name = name;
		this.salary = salary;
		this.yearOfExperience = yearOfExperience;
	}
	
	
	public Employee(int id, String name, double salary, int yearOfExperience) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.yearOfExperience = yearOfExperience;
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

	public int getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", yearOfExperience=" + yearOfExperience
				+ "]";
	}
	
	
	
	

}
