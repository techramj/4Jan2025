package com.seed;

import java.util.List;
import java.util.Set;

import org.hibernate.SessionFactory;

import com.seed.dao.EmployeeDao;
import com.seed.entity.Address;
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
		emp.setSalary(5000.0);
		
		Set<String> skills = Set.of("Core Java", "WCD", "Spring", "Hibernate");
		List<String> projects = List.of("EMS", "FB", "Mediclaim");
		
		Address add1 = new Address();
		add1.setCity("Pune");
		add1.setPincode("123456");
		
		Address add2 = new Address();
		add2.setCity("Nagpur");
		add2.setPincode("333333");
		
		
		List<Address> addresses = List.of(add1, add2);
		emp.setSkills(skills);
		emp.setProjects(projects);
		emp.setAddress(addresses);
		
		dao.save(emp);
		//display(e1);
		
	}
	
	public static void display(Employee emp) {
		System.out.println("id= "+emp.getId()+" name: "+emp.getName()+" salary= "+emp.getSalary());
		System.out.println("_____________________________________");
		System.out.println();
	}

}
