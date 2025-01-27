package com.seed.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seed.entity.Department;
import com.seed.util.HibernateUtil;

public class DepartmentDao {
	
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	public Department save(Department dept) {

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(dept);

		tx.commit();
		session.close();
		System.out.println("Departmnet added...." + dept.getDepartmentId());
		return dept;
	}

	public void delete(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
         
		Department emp = session.get(Department.class, id);
		if(emp != null) {
			session.delete(emp);
		}
		tx.commit();
		session.close();
	}

	public Department update(Department dept) {

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.saveOrUpdate(dept);

		tx.commit();
		session.close();
		System.out.println("Departments updated....");
		return dept;
	}
	
	public Department findById(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Department dept = session.get(Department.class, id);

		tx.commit();
		session.close();
		return  dept;
		
	}
	

}
