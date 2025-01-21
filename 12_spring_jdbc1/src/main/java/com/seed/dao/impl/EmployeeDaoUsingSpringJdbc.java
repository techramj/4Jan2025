package com.seed.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.seed.dao.EmployeeDao;
import com.seed.entity.Employee;

@Repository
@Primary
public class EmployeeDaoUsingSpringJdbc implements EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addEmployee(Employee employee) {
		int count = jdbcTemplate.update(INSERT_QUERY, 
				new Object[] {employee.getId(), employee.getName(), employee.getSalary(), employee.getYearOfExperience()});
		System.out.println("1 row inserted!!!!!"+ this.getClass().getSimpleName());
		
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		int count = jdbcTemplate.update(UPDATE_QUERY, 
				new Object[] {employee.getName(), employee.getSalary(), employee.getYearOfExperience(),employee.getId() });
		System.out.println("1 row updated!!!!!"+this.getClass().getSimpleName());
		
	}

	@Override
	public void deleteEmployee(int empId) {
		int count = jdbcTemplate.update(DELETE_BY_ID_QUERY, 
				new Object[] {empId});
		System.out.println(count+ " row deleted!!!!!"+this.getClass().getSimpleName());
		
	}

	@Override
	public Employee findById(int id) {
		return jdbcTemplate.queryForObject(FIND_BY_ID, new Object[] {id}, new EmpRowMapper());
	}

	@Override
	public List<Employee> findAll() {
		return jdbcTemplate.query(FIND_ALL, new EmpRowMapper());
	}
	
	class EmpRowMapper implements RowMapper<Employee>{

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new  Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
		}
	}

}
