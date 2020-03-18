package com.demo.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Address;
import com.demo.bean.Person;

public class PersonTest {

	public static void main(String[] args) {
		
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		session.beginTransaction();
		Address address= new Address("Pune", 411043);
		Person person = new Person(1, "ABhi",address);

		session.save(person);

		session.getTransaction().commit();
		
		System.out.println("Ok");

		session.close();

	}
}
