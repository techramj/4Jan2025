package com.seed.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seed.entity.Employee;
import com.seed.entity.Manager;
import com.seed.entity.SalesManager;

public class HibernateUtil {
	
	public static SessionFactory sessionFactory;
	
	static {
		Configuration config = new Configuration();
		config.addAnnotatedClass(Employee.class);
		config.addAnnotatedClass(Manager.class);
		config.addAnnotatedClass(SalesManager.class);
		
		sessionFactory = config.buildSessionFactory();
	}
	
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
