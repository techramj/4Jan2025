package com.seed.bean.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seed.bean.service.EmployeeService;

@Component(value = "empController")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	public EmployeeService getEmployeeService() {
		return employeeService;
	}

}
