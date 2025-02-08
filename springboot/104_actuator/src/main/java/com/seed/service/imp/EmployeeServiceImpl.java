package com.seed.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seed.dao.Employeerepository;
import com.seed.entity.Employee;
import com.seed.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private Employeerepository empRepository;
	
	public Employee addEmployee(Employee emp) {
		return empRepository.save(emp);
	}
	
	public Employee getEmpDetails(Integer id) {
		Employee emp = empRepository.findById(id).orElse(null);
		if(emp == null) {
			
		}
		
		return emp;

	}
	
	public List<Employee> getAllEmployeeDetails(){
		return empRepository.findAll();
	}
	
	public void deleteEmp(int id) {
		empRepository.deleteById(id);
	}
	
	public Employee updateEmployee( Employee emp) {
		return empRepository.save(emp);
	}
	

}
