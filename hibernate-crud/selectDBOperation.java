//package com.hibernate.CRUD;

//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//import com.hibernate.main.User;
//
//public class selectDBOperation {
//			
//	public void selectinfo() {
//		Configuration cfg = new Configuration();
//		  cfg.configure("configuration/hibernate.cfg.xml");
//		  
//		  SessionFactory sessionFactory = cfg.buildSessionFactory();
//		  Session session = sessionFactory.openSession() ;
//		  Transaction transaction = session.beginTransaction();
//		  
//				  User u = session.get(User.class, 1);
//				
//				  if(u != null) {
//					  
//						System.out.println(u.getId());
//						System.out.println(u.getName());
//						System.out.println(u.getPassword());
//						System.out.println(u.getGender());
//						System.out.println(u.getCity());
//				  }else {
//					  System.out.println("User Not found! ");
//				  }
//	}
//	
//
//}

package com.hibernate.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.Entity.User;

public class selectDBOperation {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		  cfg.configure("configuration/hibernate.cfg.xml");
		  
		  SessionFactory sessionFactory = cfg.buildSessionFactory();
		  Session session = sessionFactory.openSession() ;
		  Transaction transaction = session.beginTransaction();
		  
		  try {
			  User u = session.get(User.class, 2);
			
			  if(u != null) {
				  
					System.out.println(u.getId());
					System.out.println(u.getName());
					System.out.println(u.getPassword());
					System.out.println(u.getGender());
					System.out.println(u.getCity());
			  }else {
				  System.out.println("User Not found! ");
			  }
			
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

	}

}
