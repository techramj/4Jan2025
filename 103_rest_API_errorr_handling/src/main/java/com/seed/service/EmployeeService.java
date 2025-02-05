package com.seed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seed.dao.EmployeeRepository;
import com.seed.entity.Employee;
import com.seed.exception.InvalidEmployeeExcpetion;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepository;
	
	public Employee addEmployee(Employee emp) {
		return empRepository.save(emp);
	}
	
	public Employee getEmpDetails(Integer id) {
		Employee emp = empRepository.findById(id);
		return emp;
	}
	
	public List<Employee> getAllEmployeeDetails(){
		return empRepository.findAll();
	}
	
	public Employee deleteEmp(int id) {
		Employee emp = empRepository.findById(id);
		if(emp == null) {
			throw new InvalidEmployeeExcpetion("No employee with id: "+id);
		}
		empRepository.delete(emp);
		return emp;
	}
	
	public Employee updateEMployee( Employee emp) {
		return empRepository.save(emp);
	}
	

}
