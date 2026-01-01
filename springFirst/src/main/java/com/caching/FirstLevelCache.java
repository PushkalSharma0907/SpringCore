package com.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.first.Student;

public class FirstLevelCache {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		//by default first level cache is enabled
		
		Student student1 = session.get(Student.class, 101);
		System.out.println(student1);
		//session ke cache me student1 object store ho gya
		
		System.out.println("working with first level cache");
		
		Student student2 = session.get(Student.class, 101);
		//session ke cache se hi student2 object mil gya
		System.out.println(student2);
		
		System.out.println(student1 == student2); //true
		System.out.println(session.contains(student2)); //true
		
		session.close();
		//session close krne ke baad cache bhi close ho gya.
		
		Session session3 = factory.openSession();
		Student student3 = session3.get(Student.class, 101);
		
		System.out.println(student3);
		System.out.println(session3.contains(student2));
		System.out.println(student3 == student2);
		factory.close();
		
	}

}
