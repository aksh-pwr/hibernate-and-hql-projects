package com.hibernate.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.Entity.User;

public class UpdateDBOperation {

	public static void main(String[] args) {
		 Configuration cfg = new Configuration();
		  cfg.configure("configuration/hibernate.cfg.xml");
		  
		  SessionFactory sessionFactory = cfg.buildSessionFactory();
		  Session session = sessionFactory.openSession() ;
		  Transaction transaction = session.beginTransaction();
		  
		  
		  try {
			  
			  User user = session.get(User.class, 2);
			  user.setCity("Mumbai"); 
			  
			  session.saveOrUpdate(user);
			  transaction.commit();
			System.out.println("User Details updated Sucessfully !");
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

	}

}
