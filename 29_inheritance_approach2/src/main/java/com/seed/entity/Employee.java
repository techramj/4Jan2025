package com.seed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name ="emp6")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp1_id_seq")
	@SequenceGenerator(name="emp1_id_seq", sequenceName = "emp5_id_seq", initialValue = 100)
	private Integer id;
	
	private String name;
	
	private Double salary;
	
	public Employee() {
	
	}
	
	public Employee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

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

	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	

}
