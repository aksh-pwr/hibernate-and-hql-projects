package com.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.configuration.HibernateConfiguration;

public class DeleteData {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateConfiguration.getConfiguration();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("delete Employee where eid = :eid");
		query.setParameter("eid", 1);
		int update = query.executeUpdate();
		
		System.out.println("Update Data "+ update);
        transaction.commit();

	}

}
