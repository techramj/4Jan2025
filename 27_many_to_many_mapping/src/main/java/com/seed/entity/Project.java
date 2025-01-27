package com.seed.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="project4")
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project3_id_seq")
	@SequenceGenerator(name="project3_id_seq", sequenceName = "project4_id_seq", initialValue = 1000)
	private Integer projectId;
	
	
	@Column(name="project_name")
	private String name;
	
	
	@ManyToMany(mappedBy = "projects")
	private List<Employee> employees;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	

}
