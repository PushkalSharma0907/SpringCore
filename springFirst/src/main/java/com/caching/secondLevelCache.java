package com.caching;

import javax.persistence.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.cfg.Configuration;

import com.first.Student;


@Entity

public class secondLevelCache {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		//ob store in factory level cache
		//that can use it for different session
		//First session
       Session session1 = factory.openSession();
		
	
		
		Student student1 = session1.get(Student.class, 101);
		System.out.println(student1);
		
	    session1.close();
		
		System.out.println("working with first level cache");
		
		//Second Cache
		Session session2 = factory.openSession();
		Student student2 = session2.get(Student.class, 101);
		
		System.out.println(student2);
		
		System.out.println(student1 == student2); //true
		
		
		session2.close();
		
		factory.close();
		
		
	}

}
