package com.seed;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.seed.dao.EmployeeRepository;
import com.seed.dao.StudentRepository;
import com.seed.entity.Employee;
import com.seed.entity.Student;

@Component
public class Config implements CommandLineRunner{
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	EmployeeRepository empRepository;

	@Override
	public void run(String... args) throws Exception {
	  Student stud1 = new Student();
	  stud1.setName("Deepak");
	  stud1.setDateOfBirth(new Date(2004,12,1));
	  
	  studentRepository.save(stud1);
	  
	  Employee emp1 = new Employee();
	  emp1.setName("Jackson");
	  emp1.setSalary(5000);
	  
	  
	  Employee emp2 = Employee.builder()
			  .name("Jessica")
			  .salary(10000)
			  .build();
	  
	  Employee emp3 = Employee.builder()
			  .name("Siya")
			  .salary(80000)
			  .build();
	  
	  Employee emp4 = Employee.builder()
			  .name("Abhi")
			  .salary(50000)
			  .build();
	  
	  Employee emp5 = Employee.builder()
			  .name("Rajiv")
			  .salary(2000000)
			  .build();
	  
	  empRepository.save(emp1);
	  empRepository.save(emp2);
	  empRepository.save(emp3);
	  empRepository.save(emp4);
	  empRepository.save(emp5);
	  
	  List<Employee> empList = empRepository.findAll();
	  System.out.println(empList);
		
	}

}
