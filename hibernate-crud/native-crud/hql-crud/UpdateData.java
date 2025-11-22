package com.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.configuration.HibernateConfiguration;

public class UpdateData {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateConfiguration.getConfiguration();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
//        Query query = session.createQuery("update Employee set name =:n, email=:e where eid =:e_id");
//        query.setParameter("n", "kingAakash");
//        query.setParameter("e", "akKing@gmail.com");
//        query.setParameter("e_id", 1);
        
        //for positional update
        Query query = session.createQuery("update Employee set name =?1, email=?2, addr =?3 where eid =?4");
        query.setParameter(1, "pawar");
      query.setParameter(2, "pawar@gmail.com");
      query.setParameter(3, "Nashik");
      query.setParameter(4, 2);
        
        
        int update= query.executeUpdate();
        
        System.out.println("Update Data "+ update);
        transaction.commit();

	}

}
