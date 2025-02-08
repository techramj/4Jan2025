package com.seed.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seed.entity.Employee;

@Repository
public interface Employeerepository extends JpaRepository<Employee, Integer>{

}
