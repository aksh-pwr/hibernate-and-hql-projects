package com.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.Entity.Student;
import com.hibernate.configuration.HibernateConfiguration;

public class InsertDataNative {

	public static void main(String[] args) {
		Session session = HibernateConfiguration.getConfiguration().openSession();
		Transaction transaction = session.beginTransaction();
		
		Student stu = new Student();
		stu.setId(1);
		stu.setName("Aakash");
		stu.setAddr("Dhule");
		stu.setEmail("aakas16h@gmail.com");
		
		Student stu1 = new Student();
		stu1.setId(2);
		stu1.setName("Dheeraj");
		stu1.setAddr("Nashik");
		stu1.setEmail("Dheeraj16@gmail.com");
		
		
		session.save(stu);
		session.save(stu1);
		transaction.commit();
		

	}

}
