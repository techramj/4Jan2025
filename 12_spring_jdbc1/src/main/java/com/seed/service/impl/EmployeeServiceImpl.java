package com.seed.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.seed.dao.EmployeeDao;
import com.seed.entity.Employee;
import com.seed.service.EmployeeService;

@Service
//@Component
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
		System.out.println("EMployee added successfully......"+ employeeDao.getClass());
		
	}

	@Override
	public void deleteEmployee(int employeeId) {
		employeeDao.deleteEmployee(employeeId);
	}

	@Override
	public Employee getEmployeeDetails(int employeeId) {
		Employee emp =  employeeDao.findById(employeeId);
		if(emp == null) {
			//throw exception
		}
		return emp;
	}

	@Override
	public Employee updateEmployeeDetails(Employee employee) {
		employeeDao.updateEmployee(employee);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployeesDetails() {
		return employeeDao.findAll();
	}

	@Override
	public List<Employee> getEmployeesDetails(String name) {
		List<Employee> empList = employeeDao.findAll();
		
		//logic to filter employee with the name
		return null;
	}

	@Override
	public List<Employee> getEmployeesHavingExperince(int yearOfExperince) {
		
		List<Employee> empList = employeeDao.findAll();
		
		//logic to filter employee with the name
		return null;
	}
	

}
