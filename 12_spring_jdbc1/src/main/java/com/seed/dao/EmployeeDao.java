package com.seed.dao;

import java.util.List;

import com.seed.entity.Employee;

public interface EmployeeDao {
	String INSERT_QUERY ="insert into seed_emp(id,name,salary,year_of_exp) values (?,?,?,?)";
	String UPDATE_QUERY = "update seed_emp set name =?, salary = ?, year_of_exp = ? where id = ?";
	String DELETE_BY_ID_QUERY = "delete from seed_emp where id = ?";
	String FIND_BY_ID ="select * from seed_emp where id = ?";
	String FIND_ALL = "select * from seed_emp";
	
	void addEmployee(Employee employee);
	void updateEmployee(Employee employee);
	void deleteEmployee(int empId);
	Employee findById(int id);
	List<Employee> findAll(); 
	
	
}
