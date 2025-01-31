package com.seed;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.seed.dao.StudentRepository;
import com.seed.entity.Student;

@Component
public class Config implements CommandLineRunner{
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
	  Student stud1 = new Student();
	  stud1.setName("Deepak");
	  stud1.setDateOfBirth(new Date(2004,12,1));
	  
	  studentRepository.save(stud1);
		
	}

}
