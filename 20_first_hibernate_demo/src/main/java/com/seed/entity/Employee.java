package com.seed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="emp")
public class Employee {

	@Id
	private Integer id;
	private String name;
	
	@Column(name = "salary")
	private Double basicSalary;
	
	private String city;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(Double salary) {
		this.basicSalary = salary;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

}
