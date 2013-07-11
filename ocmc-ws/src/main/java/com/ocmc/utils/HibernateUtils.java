package com.ocmc.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class HibernateUtils {
	
	private SessionFactory sessionFactory;
	//private static final ServiceRegistry serviceRegistry;
	
	/**static {
		Configuration conf = new Configuration();
		conf.configure("spring/hibernate.cfg.xml");
		serviceRegistry = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
		try {
			sessionFactory = conf.buildSessionFactory(serviceRegistry);
		} catch (Exception e) {
			System.err.println("Initial SessionFactory creation failed." + e);
			throw new ExceptionInInitializerError(e);
		}		
	}
	*/
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
	     this.sessionFactory = sessionFactory;
	 }
	
	public SessionFactory getSessionFactory(){
		return this.sessionFactory;
	}
}
