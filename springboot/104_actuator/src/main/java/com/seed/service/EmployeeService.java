package com.seed.service;

import java.util.List;

import com.seed.entity.Employee;



public interface EmployeeService {
	
	public Employee addEmployee(Employee emp);
	public Employee getEmpDetails(Integer id);
	public List<Employee> getAllEmployeeDetails();
	public void deleteEmp(int id);
	public Employee updateEmployee( Employee emp);

}
