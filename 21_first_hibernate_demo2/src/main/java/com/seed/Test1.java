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
		emp.setName("Jack");
		//Employee e1 = dao.save(emp);
		//display(e1);
		
	}
	
	public static void display(Employee emp) {
		System.out.println("id= "+emp.getId()+" name: "+emp.getName()+" salary= "+emp.getSalary());
		System.out.println("_____________________________________");
		System.out.println();
	}

}
