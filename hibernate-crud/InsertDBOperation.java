package com.hibernate.CRUD;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.Entity.User;

public class InsertDBOperation {
  public static void main(String[] args) {
	  
//	  User user1 = new User();
//	  user1.setId(1);
//	  user1.setEmail("deepak@gmail.com");
//	  user1.setName("deepak");
//	  user1.setPassword("deepak@123");
//	  user1.setGender("Male");
//	  user1.setCity("Nashik");
	  
	  User user1 = new User();
	  user1.setEmail("shivaji@gmail.com");
	  user1.setName("shivaji");
	  user1.setPassword("shivaji@123");
	  user1.setGender("Male");
	  user1.setCity("Dhule");
    
	  Configuration cfg = new Configuration();
	  cfg.configure("configuration/hibernate.cfg.xml");
	  
	  SessionFactory sessionFactory = cfg.buildSessionFactory();
	  Session session = sessionFactory.openSession() ;
	  Transaction transaction = session.beginTransaction();
	  
	  try {
		  session.save(user1);
		  transaction.commit();
		
	} catch (Exception e) {
		transaction.rollback();
		e.printStackTrace();
	}
  }
}
