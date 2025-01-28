package com.seed.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name ="emp4")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp1_id_seq")
	@SequenceGenerator(name="emp1_id_seq", sequenceName = "emp4_id_seq", initialValue = 100)
	private Integer id;
	

	private String name;
	
	@Column(name = "salary")
	private Double salary;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="passport_id")
	private Passport passport;
	
	
	@ManyToOne
	@JoinColumn(name="did")
	private Department department;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name ="emp_project", 
	joinColumns = { @JoinColumn(name ="emp_id")},
	inverseJoinColumns = {@JoinColumn(name="p_id")}
	)
	private List<Project> projects = new ArrayList<Project>();
	
	
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
	
	public Passport getPassport() {
		return passport;
	}
	
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public List<Project> getProjects() {
		return projects;
	}
	
	public void setProjects(List<Project> projects) {
		this.projects.addAll(projects);
	}
	
	public void addProject(Project project) {
		this.projects.add(project);
	}

}
