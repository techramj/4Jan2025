package com.seed.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seed.entity.Employee;
import com.seed.util.HibernateUtil;

public class EmployeeDao {

	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public Employee save(Employee emp) {

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(emp);

		tx.commit();
		session.close();
		System.out.println("1 row inserted....");
		return emp;
	}

	public Employee update(Employee emp) {

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.update(emp);

		tx.commit();
		session.close();
		System.out.println("1 row inserted....");
		return emp;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
