package com.seed.service.imp;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seed.dao.Employeerepository;
import com.seed.dto.EmployeeDTO;
import com.seed.entity.Employee;
import com.seed.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private Employeerepository empRepository;
	
	public EmployeeDTO addEmployee(EmployeeDTO empDto) {
		Employee e = from(empDto);
		Employee emp = empRepository.save(e);
		return EmployeeDTO.of(emp);
	}
	
	public EmployeeDTO getEmpDetails(Integer id) {
		Employee emp = empRepository.findById(id).orElse(null);
		if(emp == null) {
			
		}
		
		return EmployeeDTO.of(emp);

	}
	
	public List<EmployeeDTO> getAllEmployeeDetails(){
		 List<Employee> empList = empRepository.findAll();
		 List<EmployeeDTO> dtoList = empList.stream().map(EmployeeDTO::of).collect(Collectors.toList());
		 return dtoList; 
	}
	
	public void deleteEmp(int id) {
		empRepository.deleteById(id);
	}
	
	public EmployeeDTO updateEmployee( EmployeeDTO empDto) {
		Employee e = from(empDto);
		Employee emp = empRepository.save(e);
		return EmployeeDTO.of(emp);
	}
	
	
	private Employee from(EmployeeDTO dto) {
		Employee emp = new Employee();
		emp.setId(dto.getId());
		emp.setName(dto.getName());
		emp.setSalary(dto.getSalary());
		return emp;
	}

}
