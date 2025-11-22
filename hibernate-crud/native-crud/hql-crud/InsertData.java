package com.hibernate.crud;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.Entity.Employee;
import com.hibernate.configuration.HibernateConfiguration;

public class InsertData {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateConfiguration.getConfiguration();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Employee emp = new Employee();
        emp.setName("Aakash");
        emp.setEid(1);
        emp.setEmail("aakash@gmail.com");
        emp.setAddr("Dhule");
        session.save(emp);

        Employee emp1 = new Employee();
        emp1.setName("Virat");
        emp1.setEid(2);
        emp1.setEmail("virat@gmail.com");
        emp1.setAddr("Delhi");
        session.save(emp1);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
