package com.seed;

import java.time.LocalDate;
import java.util.Date;

import org.hibernate.SessionFactory;

import com.seed.dao.DepartmentDao;
import com.seed.dao.EmployeeDao;
import com.seed.dao.PassportDao;
import com.seed.dao.ProjectDao;
import com.seed.entity.Department;
import com.seed.entity.Employee;
import com.seed.entity.Passport;
import com.seed.entity.Project;
import com.seed.util.HibernateUtil;

public class Test1 {
	
	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		System.out.println(sf);
		
		//addSampleEmployee();
		fetchExample();
		
	}
	
	public static void fetchExample() {
		EmployeeDao empDao = new EmployeeDao();
		Employee emp = empDao.findById(100);
		System.out.println(emp.getName()+ " "+emp.getSalary());
	
	    String deptname = emp.getDepartment().getDepartmentName();

	}
	
	public static void addSampleEmployee() {
		
		EmployeeDao empDao = new EmployeeDao();
		PassportDao passportDao = new PassportDao();
		DepartmentDao deptDao = new DepartmentDao();
		ProjectDao projectDao = new ProjectDao();
		
		//2 employees
		// 2 passport
		// 1 dept
		
		//4 departments
		Department it = new Department("IT");
		Department hr = new Department("HR");
		Department account = new Department("Account");
		Department admin = new Department("Admin");
		
		deptDao.save(it);
		deptDao.save(hr);
		deptDao.save(account);
		deptDao.save(admin);
		
		//4 Project project
		Project ems = new Project("EMS");
		Project mediclaim = new Project("Mediclaim");
		Project horoscope = new Project("Horoscope");
		Project sc = new Project("Social Connect");
		
		projectDao.save(ems);
		projectDao.save(mediclaim);
		projectDao.save(horoscope);
		projectDao.save(sc);
		
	
		
		//3 Passport
		Passport passport1 = createPassport("ABcdefgh1234", new Date(2030,4,4));
		Passport passport2 = createPassport("ABcdefgh1234", new Date(2030,4,4));
		Passport passport3 = createPassport("ABcdefgh1234", new Date(2030,4,4));
		
		passportDao.save(passport1);
		passportDao.save(passport2);
		passportDao.save(passport3);
		
		
		Employee emp1 = createEmployee("Jack", 5000, passport1, it);
		Employee emp2 = createEmployee("Jessica", 15000, passport2, it);
		Employee emp3 = createEmployee("Sam", 20000, passport3, hr);
		
		ems.addEmployee(emp1);
		ems.addEmployee(emp2);
		mediclaim.addEmployee(emp3);
		sc.addEmployee(emp3);
		
		
		emp1.addProject(ems);
		emp2.addProject(ems);
		
		emp3.addProject(mediclaim);
		emp3.addProject(sc);
		
		empDao.save(emp1);
		empDao.save(emp2);
		empDao.save(emp3);
		
	}
	
	
	private static Passport createPassport(String passNo, Date expiryDate) {
		Passport p = new Passport();
		p.setExpiryDate(expiryDate);
		p.setPassportNumber(passNo);
		return p;
	}
	
	private static Employee createEmployee(String name, double salary, Passport passport, Department dept ) {
		Employee emp = new Employee();
		emp.setName(name);
		emp.setSalary(salary);
		emp.setPassport(passport);
		emp.setDepartment(dept);
		return emp;
	}
	
	

}
