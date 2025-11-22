package com.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import com.hibernate.configuration.HibernateConfiguration;

public class DeleteDBOperation {

    public static void main(String[] args) {

        Session session = HibernateConfiguration.getConfiguration().openSession();
        Transaction transaction = session.beginTransaction();

        try {
            NativeQuery query = session.getNamedNativeQuery("DeleteData");
            query.setParameter("n_id", 4);

            int updateCount = query.executeUpdate();
            System.out.println("Deleted rows: " + updateCount);

            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
