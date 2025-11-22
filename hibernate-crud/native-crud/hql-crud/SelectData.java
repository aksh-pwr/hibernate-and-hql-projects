package com.hibernate.crud;

//import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.hibernate.Entity.Employee;
import com.hibernate.configuration.HibernateConfiguration;

public class SelectData {

	public static void main(String[] args) {
		Session session = HibernateConfiguration.getConfiguration().openSession();
		
//		Query query = session.createQuery("from Employee");
//		List<Employee> List = query.getResultList();
//		
//		for(Employee emp:List) {
//			System.out.println(emp.getEid());
//			System.out.println(emp.getName());
//			System.out.println(emp.getEmail());
//			System.out.println(emp.getAddr());
//		}
		
		Query query = session.createQuery("from Employee where id =:e");
		query.setParameter("e", 1);
		
		Employee emp = (Employee) query.getSingleResult();
		System.out.println(emp.getEid());
		System.out.println(emp.getName());
		System.out.println(emp.getEmail());
		System.out.println(emp.getAddr());
		
	}

}
