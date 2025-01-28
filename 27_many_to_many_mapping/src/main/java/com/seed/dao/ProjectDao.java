package com.seed.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seed.entity.Passport;
import com.seed.entity.Project;
import com.seed.util.HibernateUtil;

public class ProjectDao {

	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	
	public Project save(Project project) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(project);
		
		tx.commit();
		session.close(); 
		return project;
	}
	
	public Project findById(Long projectId) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Project project = session.get(Project.class, projectId);
		
		tx.commit();
		session.close(); 
		return project;
	}
	
}
