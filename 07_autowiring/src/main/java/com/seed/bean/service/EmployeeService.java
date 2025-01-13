package com.seed.bean.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.seed.bean.dao.EmployeeDao;

@Component
public class EmployeeService {
	
	@Autowired
	//@Qualifier(value = "employeeDaoImpl2")
	private EmployeeDao employeeDao;
	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

}
