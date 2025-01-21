package com.seed.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.seed.dao.EmployeeDao;
import com.seed.entity.Employee;

@Repository
//@Primary
public class EmployeeDaoUsingJdbc implements EmployeeDao{
	
	//@Autowired(required = false)
	//private Connection connection;
	
	@Autowired
	private DataSource dataSource;

	@Override
	public void addEmployee(Employee employee) {
		try(PreparedStatement ps = dataSource.getConnection().prepareStatement(INSERT_QUERY)){
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setDouble(3, employee.getSalary());
			ps.setInt(4, employee.getYearOfExperience());
			ps.executeUpdate();
			System.out.println("1 row inserted!");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
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
		
		try(PreparedStatement ps = dataSource.getConnection().prepareStatement(FIND_BY_ID)){
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return new  Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
			}
	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> empList = new ArrayList<Employee>();
		try(PreparedStatement ps = dataSource.getConnection().prepareStatement(FIND_ALL)){
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Employee emp = new  Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
				empList.add(emp);
			}
	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return empList; 
	}

}
