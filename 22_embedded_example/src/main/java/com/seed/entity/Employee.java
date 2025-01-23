package com.seed.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="emp")
public class Employee {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(updatable = false)
	private String name;
	private Double salary;
	
	@Embedded
	@AttributeOverrides(value= {
			@AttributeOverride(name="city", column = @Column(name="mailing_city")),
			@AttributeOverride(name="pincode", column = @Column(name="mailing_pincode")),
	})
	private Address mailAddress;
	
	@Embedded
	@AttributeOverrides(value= {
			@AttributeOverride(name="city", column = @Column(name="permanent_city")),
			@AttributeOverride(name="pincode", column = @Column(name="permanent_pincode")),
	})
	private Address permanentAddress;
	
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
	
	public Address getMailAddress() {
		return mailAddress;
	}
	
	public void setMailAddress(Address mailAddress) {
		this.mailAddress = mailAddress;
	}
	
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

}
