package com.ref;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.first.Student;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        System.out.println(factory);
        
        Certificate cert = new Certificate("Java dev","6 months");
//        Certificate cert1 = new Certificate("Java backend dev","6 months");
        Student student = new Student(104,"lion","Kailash",cert);
 //       Student student1 = new Student(102,"Kartikey","Kailash",cert1);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(student);
//        session.persist(student1);
        tx.commit();
        session.close();
    }
}