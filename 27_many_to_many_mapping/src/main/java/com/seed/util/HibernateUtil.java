package com.seed.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seed.entity.Department;
import com.seed.entity.Employee;
import com.seed.entity.Passport;
import com.seed.entity.Project;

public class HibernateUtil {
	
	public static SessionFactory sessionFactory;
	
	static {
		System.out.println("creating session factory object!!!");
		Configuration config = new Configuration();
		config.addAnnotatedClass(Employee.class);
		config.addAnnotatedClass(Passport.class);
		config.addAnnotatedClass(Department.class);
		config.addAnnotatedClass(Project.class);
		
		sessionFactory = config.buildSessionFactory();
	}
	
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
