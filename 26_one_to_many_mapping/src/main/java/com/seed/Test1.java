package com.seed;

import java.util.Date;

import org.hibernate.SessionFactory;

import com.seed.dao.EmployeeDao;
import com.seed.dao.PassportDao;
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
		Employee emp = empDao.findById(2);
		System.out.println(emp.getName()+ " "+emp.getSalary());
		
	
		PassportDao passportDao = new PassportDao();
		Passport passport = passportDao.findById(1L);

	}
	
	public static void addSampleEmployee() {
		EmployeeDao empDao = new EmployeeDao();
		PassportDao passportDao = new PassportDao();

		
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("Jack");
		emp.setSalary(5000.0);
		
		Passport p1 =new Passport();
		p1.setPassportNumber("ABCDEFGHI");
		p1.setExpiryDate(new Date(2032, 1, 12));
		
		emp.setPassport(p1);
		
		//passportDao.save(p1);
		empDao.save(emp);
	}
	
	
	

}
