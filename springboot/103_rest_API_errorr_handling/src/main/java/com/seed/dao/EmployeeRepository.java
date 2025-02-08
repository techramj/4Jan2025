package com.seed.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seed.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class EmployeeRepository {
	
	@Autowired
	EntityManager em;
	
	public Employee save(Employee emp) {
		return em.merge(emp);
	}
	
	
	public Employee findById(Integer id) {
		return em.find(Employee.class, id);
	}
	
	public List<Employee> findAll(){
		Query query = em.createQuery("from Employee ");
		return query.getResultList();
	}
	
	public void delete(Employee emp) {
		em.remove(emp);
	}
	

}
