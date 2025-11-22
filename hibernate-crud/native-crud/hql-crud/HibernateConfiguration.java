package com.hibernate.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfiguration {
	
	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getConfiguration() {
		
		if(sessionFactory == null) {
			Configuration cfg = new Configuration();
			cfg.configure();
			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}

}
