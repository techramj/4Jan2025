package com.seed.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	public static SessionFactory sessionFactory;
	
	static {
		System.out.println("creating session factory object!!!");
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		sessionFactory = config.buildSessionFactory();
	}
	
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
