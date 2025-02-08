package com.seed.dto;

import com.seed.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
	
	private Integer id;
	private String name;
	private double salary;
	
	public static EmployeeDTO of(Employee emp) {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setId(emp.getId());
		dto.setName(emp.getName());
		dto.setSalary(emp.getSalary());
		return dto;
	}

}
