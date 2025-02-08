package com.seed.service;

import java.util.List;

import com.seed.dto.EmployeeDTO;
import com.seed.entity.Employee;



public interface EmployeeService {
	
	public EmployeeDTO addEmployee(EmployeeDTO emp);
	public EmployeeDTO getEmpDetails(Integer id);
	public List<EmployeeDTO> getAllEmployeeDetails();
	public void deleteEmp(int id);
	public EmployeeDTO updateEmployee( EmployeeDTO emp);

}
