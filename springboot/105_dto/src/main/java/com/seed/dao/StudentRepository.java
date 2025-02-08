package com.seed.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seed.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
