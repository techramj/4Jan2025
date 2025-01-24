package com.seed.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seed.entity.Passport;
import com.seed.util.HibernateUtil;

public class PassportDao {

	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	
	public Passport save(Passport passport) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(passport);
		
		tx.commit();
		session.close(); 
		System.out.println("1 passport added...."+ passport.getPassportId());
		return passport;
	}
	
	public Passport findById(Long passportId) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Passport passport = session.get(Passport.class, passportId);
		
		tx.commit();
		session.close(); 
		return passport;
	}
	
}
