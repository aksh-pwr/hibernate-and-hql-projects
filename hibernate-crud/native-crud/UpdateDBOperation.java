package com.hibernate.crud;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import com.hibernate.configuration.HibernateConfiguration;

public class UpdateDBOperation {

	public static void main(String[] args) {
		
Session session = HibernateConfiguration.getConfiguration().openSession();
Transaction transaction = session.beginTransaction();
		
	NativeQuery query = session.getNamedNativeQuery("UpdateData");
	query.setParameter("n", "aakash@gmail.com");
	query.setParameter("s_id", 3);
	int update = query.executeUpdate();
		System.out.println("Update data....!" + update);
		
		transaction.commit();
	}

}
