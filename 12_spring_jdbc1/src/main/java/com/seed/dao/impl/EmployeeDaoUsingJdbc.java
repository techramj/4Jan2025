package com.seed.dao.impl;

import java.sql.Connection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.seed.dao.EmployeeDao;
import com.seed.entity.Employee;

@Repository
@Primary
public class EmployeeDaoUsingJdbc implements EmployeeDao{
	
	@Autowired(required = false)
	private Connection connection;

	@Override
	public void addEmployee(Employee employee) {
		String sql ="insert into seed_emp(id,name,salary,year_of_exp) values (?,?,?,?)";
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee findById(int id) {
		String sql ="select * from seed_emp where id = ?";
		return null;
	}

	@Override
	public List<Employee> findAll() {
		String sql ="select * from seed_emp";
		return null;
	}

}
