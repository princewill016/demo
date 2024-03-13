package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoApplication {

	// @SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		Transaction transaction = s.beginTransaction();

		pojo p = new pojo();
		// p.setAge(26);
		// p.setFirstName("Bright");
		// p.setLastName("peter");
		// p.setGender('M');
		// s.save(p);
		p =(pojo) s.get(pojo.class, 2);
		System.out.println("Retrieved entity: " + p.toString());
		transaction.commit();
		
	}
}
