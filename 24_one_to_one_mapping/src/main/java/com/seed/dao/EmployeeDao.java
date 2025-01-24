package com.seed.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seed.entity.Employee;
import com.seed.entity.Passport;
import com.seed.util.HibernateUtil;

public class EmployeeDao {

	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public Employee save(Employee emp) {

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(emp);

		tx.commit();
		session.close();
		System.out.println("Employee added...." + emp.getId());
		return emp;
	}

	public void delete(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
         
		Employee emp = session.get(Employee.class, id);
		if(emp != null) {
			session.delete(emp);
		}
		tx.commit();
		session.close();
	}

	public Employee update(Employee emp) {

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.saveOrUpdate(emp);

		tx.commit();
		session.close();
		System.out.println("Employee updated...." + emp.getId());
		return emp;
	}
	
	public Employee findById(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Employee emp = session.get(Employee.class, id);

		Passport p = emp.getPassport();
		tx.commit();
		session.close();
		return  emp;
		
	}
	

}
