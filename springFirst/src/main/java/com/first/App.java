package com.first;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        System.out.println(factory);
        
 //      Student st = new Student(101,"Ganesh ","Kailash");
//        Student st = new Student(102,"Kartikey ","Kailash");
        
//        System.out.println(st);
        
//        Session session = factory.openSession();
//        Transaction tx = session.beginTransaction();
//        session.persist(st);
//        tx.commit();
//        session.close();
        
        
        Address ad = new Address();
        ad.setStreet("Krishna nagar");
        ad.setCity("Gwalior");
        ad.setOpen(true);
        ad.setDate(LocalDateTime.now());
        ad.setX(1234.567);
        
        //reading image
        FileInputStream fis = new FileInputStream("src/main/java/com/first/image.png");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        System.out.println(ad);
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(ad);
        tx.commit();
        session.close();
        
        //find also get v hota h 
//		Session session = factory.openSession();
//		Address ad = session.load(Address.class, 1);
//		System.out.println(ad);
//		session.close();
		
//		Session session = factory.openSession();
//		Address ad = (Address)session.load(Address.class, 1);
//		System.out.println();
//		session.close();
//        
    }
}
