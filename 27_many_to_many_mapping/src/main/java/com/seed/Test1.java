package com.seed;

import java.time.LocalDate;
import java.util.Date;

import org.hibernate.SessionFactory;

import com.seed.dao.DepartmentDao;
import com.seed.dao.EmployeeDao;
import com.seed.dao.PassportDao;
import com.seed.entity.Department;
import com.seed.entity.Employee;
import com.seed.entity.Passport;
import com.seed.util.HibernateUtil;

public class Test1 {
	
	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		System.out.println(sf);
		
		//addSampleEmployee();
		//fetchExample();
		
	}
	
	public static void fetchExample() {
		EmployeeDao empDao = new EmployeeDao();
		Employee emp = empDao.findById(100);
		System.out.println(emp.getName()+ " "+emp.getSalary());
	
	    String deptname = emp.getDepartment().getDepartmentName();

	}
	
	public static void addSampleEmployee() {
		
		//2 employees
		// 2 passport
		// 1 dept
		
		EmployeeDao empDao = new EmployeeDao();
		PassportDao passportDao = new PassportDao();
		DepartmentDao deptDao = new DepartmentDao();
		
		Department d1 = new Department("IT");
		deptDao.save(d1);

		
		Employee emp = new Employee();
		emp.setName("Jack");
		emp.setSalary(5000.0);
		
		Passport p1 =new Passport();
		p1.setPassportNumber("ABCDEFGHI");
		p1.setExpiryDate(LocalDate.of(2030, 12, 20));
		emp.setPassport(p1);
		
		
		
		emp.setDepartment(d1);
		
		//passportDao.save(p1);
		empDao.save(emp);
		
		Employee emp2 = new Employee();
		emp2.setName("Jessica");
		emp2.setSalary(9000.0);
		
		Passport p2 = new Passport();
		p2.setPassportNumber("ABCABCABCABC");
		emp2.setPassport(p2);
		emp2.setDepartment(d1);
		
		empDao.save(emp2);
	}
	
	
	

}
