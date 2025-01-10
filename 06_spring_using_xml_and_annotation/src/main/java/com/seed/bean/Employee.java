package com.seed.bean;

import java.util.Objects;

import org.springframework.stereotype.Component;

//@Component  //by default the bean name will be same name of a class i.e employee
@Component(value = "emp1234")
public class Employee {
	
	private int id;
	private String name;
	private double salary;  
	
	public Employee() {
		System.out.println("default constructor called");
	}
	
	public Employee(int id, String name, double salary) {
		System.out.println("parameterized constructor called...");
		this.id = id;
		this.name = name;
	    this.salary = salary;
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

	@Override
	public String toString() {
		int x = 10;  //x is local variable
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]" ;
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
