package com.hibernate.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import com.hibernate.Entity.Student;
import com.hibernate.configuration.HibernateConfiguration;

public class selectDBoperation {

	public static void main(String[] args) {
		Session session = HibernateConfiguration.getConfiguration().openSession();
		
//		String sql = "Select * from Student";
	NativeQuery query = session.getNamedNativeQuery("SelectData");
		
		List<Object []> objectList = query.getResultList();
		for(Object[] obj: objectList) {
			System.out.println(obj[0]);
			System.out.println(obj[1]);
			System.out.println(obj[2]);
			System.out.println(obj[3]);
			
		}
		
	}

}
