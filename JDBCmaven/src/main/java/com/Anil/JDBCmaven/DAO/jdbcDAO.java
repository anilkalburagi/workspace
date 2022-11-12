package com.Anil.JDBCmaven.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Anil.JDBCmaven.entity.jdbc;

public class jdbcDAO {
	
	 private SessionFactory factory = null;
	 
	 public  jdbcDAO() {
		
	
	 
	 Configuration confoguration = new Configuration();
		confoguration.configure();
		factory = confoguration.buildSessionFactory();
	 }
	
	public void getAll(){
		
		
		
		Session session= factory.openSession();
		
		jdbc Jdbc= session.get(jdbc.class,1);
		System.out.println(Jdbc);
		

		jdbc Jdbc1= session.get(jdbc.class,2);
		System.out.println(Jdbc1);
		
		//session.close();

		jdbc Jdbc2= session.get(jdbc.class,3);
		System.out.println(Jdbc2);
		

		jdbc Jdbc3= session.get(jdbc.class,4);
		System.out.println(Jdbc3);
		

		jdbc Jdbc4= session.get(jdbc.class,5);
		System.out.println(Jdbc4);
	
		
		session.close();
	}
	
	public void save(jdbc Jdbc) {
		Session session= factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(Jdbc);


		jdbc Jdbc5= session.get(jdbc.class,6);
		System.out.println(Jdbc5);
		transaction.commit();
		session.close();
	}

}
