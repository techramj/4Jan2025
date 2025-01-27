package com.seed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "dept2")
public class Department {

	@Column(name = "did")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dept_id_gen")
	@SequenceGenerator(name = "dept_id_gen", sequenceName = "dept2_did_seq", allocationSize = 10, initialValue = 10)
	@Id
	private Integer departmentId;

	@Column(name = "dname", length = 20)
	private String departmentName;

	public Department() {
	
	}

	public Department(Integer departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
