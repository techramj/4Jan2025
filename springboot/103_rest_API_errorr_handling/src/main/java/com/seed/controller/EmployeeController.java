package com.seed.controller;

import java.net.URI;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.seed.entity.Employee;
import com.seed.exception.InvalidEmployeeExcpetion;
import com.seed.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
public class EmployeeController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService empService;
	
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployeeDetails(){
		List<Employee> empList = empService.getAllEmployeeDetails();
		return empList;
	}
	
	
	@GetMapping("/employees/{empId}")
	public Employee getEmployeeDetails(@PathVariable("empId") int id) {
		System.out.println("id = "+id);
		logger.info("calling getEmployeeDetails method");
		logger.debug("id === "+id);
		Employee emp = empService.getEmpDetails(id);
		if(emp == null) {
			throw new InvalidEmployeeExcpetion("no employee with id : "+id);
		}
		return emp;
	}
	
	
	@PostMapping("/employees")	
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp) {
		logger.info("emp details to be added: "+emp.getId()+"  "+emp.getName()+"  "+emp.getSalary());
		
		
		Employee newEmp =  empService.addEmployee(emp);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{empId}").buildAndExpand(newEmp.getId()).toUri();
		
		return ResponseEntity.created(location).body(newEmp);
		//return ResponseEntity.ok(newEmp);
	}
	
	
	@DeleteMapping("/employees/{id}")
	public Employee deleteEmp(@PathVariable("id") int id) {
		System.out.println("id = "+id);
		return empService.deleteEmp(id);
	}
	
	
	@PutMapping("/employees")	
	public Employee updateEmp(@Valid @RequestBody Employee emp) {
		return empService.updateEMployee(emp);
	}
	
}
