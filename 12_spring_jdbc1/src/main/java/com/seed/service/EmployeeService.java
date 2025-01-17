package com.seed.service;

import java.util.List;

import com.seed.entity.Employee;



public interface EmployeeService {
	
	void addEmployee(Employee employee);
	void deleteEmployee(int employeeId);
	Employee getEmployeeDetails(int employeeId);
	Employee updateEmployeeDetails(Employee employee);
	List<Employee> getAllEmployeesDetails();
	List<Employee> getEmployeesDetails(String name);
	List<Employee> getEmployeesHavingExperince(int yearOfExperince);
	
}
