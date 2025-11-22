package com.hibernate.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.Entity.User;

public class deleteDBOperation {

	public static void main(String[] args) {
		 Configuration cfg = new Configuration();
		  cfg.configure("configuration/hibernate.cfg.xml");
		  
		  SessionFactory sessionFactory = cfg.buildSessionFactory();
		  Session session = sessionFactory.openSession() ;
		  Transaction transaction = session.beginTransaction();
		  
		  try {
			 
			  User user = new User();
			 
			  if(user != null) {
				  
				  user.setId(2);
				  
				  session.delete(user);
				  transaction.commit();
			  }
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

	}

}
