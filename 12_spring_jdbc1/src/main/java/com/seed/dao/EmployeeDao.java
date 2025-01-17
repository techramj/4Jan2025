package com.seed.dao;

import java.util.List;

import com.seed.entity.Employee;

public interface EmployeeDao {
	void addEmployee(Employee employee);
	void updateEmployee(Employee employee);
	void deleteEmployee(int empId);
	Employee findById(int id);
	List<Employee> findAll(); 
}
