package com.seed;

import org.hibernate.SessionFactory;

import com.seed.dao.EmployeeDao;
import com.seed.entity.Employee;
import com.seed.entity.Manager;
import com.seed.entity.SalesManager;
import com.seed.util.HibernateUtil;

public class Test1 {
	
	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Employee emp1 = new Employee("Jack", 5000.0);
		Employee emp2 = new Manager("Sam", 12000, 3);
		Employee emp3 = new SalesManager("Jessica", 15000, 4, 40000, 2);
		
		EmployeeDao empDao = new EmployeeDao();
		empDao.save(emp1);
		empDao.save(emp2);
		empDao.save(emp3);

		
	}
	
	public static void display(Employee emp) {
		System.out.println("id= "+emp.getId()+" name: "+emp.getName()+" salary= "+emp.getSalary());
		System.out.println("_____________________________________");
		System.out.println();
	}

}
