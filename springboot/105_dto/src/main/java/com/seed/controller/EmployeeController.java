package com.seed.controller;

import java.net.URI;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.seed.dto.EmployeeDTO;

import com.seed.service.EmployeeService;


@RestController
public class EmployeeController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService empService;
	
	
	@GetMapping("/employees")
	public List<EmployeeDTO> getAllEmployeeDetails(){
		List<EmployeeDTO> empList = empService.getAllEmployeeDetails();
		return empList;
	}
	
	
	@GetMapping("/employees/{empId}")
	public EmployeeDTO getEmployeeDetails(@PathVariable("empId") int id) {
		System.out.println("id = "+id);
		logger.info("calling getEmployeeDetails method");
		logger.debug("id === "+id);
		EmployeeDTO emp = empService.getEmpDetails(id);
		/*if(emp == null) {
			throw new InvalidEmployeeExcpetion("no employee with id : "+id);
		}*/
		return emp;
	}
	
	
	@PostMapping("/employees")	
	public ResponseEntity<EmployeeDTO> addEmployee(@RequestBody EmployeeDTO emp) {
		
		
		
		EmployeeDTO newEmp =  empService.addEmployee(emp);
		logger.info("emp details to be added: "+newEmp.getId()+"  "+newEmp.getName()+"  "+newEmp.getSalary());
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{empId}").buildAndExpand(newEmp.getId()).toUri();
		
		return ResponseEntity.created(location).body(newEmp);
		//return ResponseEntity.ok(newEmp);
	}
	
	
	@DeleteMapping("/employees/{id}")
	public String deleteEmp(@PathVariable("id") int id) {
		System.out.println("id = "+id);
		return "records deleted";
	}
	
	
	@PutMapping("/employees")	
	public EmployeeDTO updateEmp(@RequestBody EmployeeDTO emp) {
		return empService.updateEmployee(emp);
	}
	
}
