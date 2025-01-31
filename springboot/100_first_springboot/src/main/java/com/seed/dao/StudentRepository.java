package com.seed.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seed.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class StudentRepository {
	
	@Autowired
	EntityManager em;
	
	public Student save(Student student) {
		return em.merge(student);
	}
	
	
	public Student findById(Integer id) {
		return em.find(Student.class, id);
	}
	
	public List<Student> findAll(){
		return null;
	}
	

}
