package com.seed;

import org.hibernate.SessionFactory;

import com.seed.dao.EmployeeDao;
import com.seed.entity.Employee;
import com.seed.util.HibernateUtil;

public class Test1 {
	
	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		System.out.println(sf);
		
		EmployeeDao dao = new EmployeeDao();
		dao.setSessionFactory(sf);
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Jack");
		emp.setBasicSalary(5000.0);
		emp.setCity("Pune");
		dao.save(emp);
		
	}

}
