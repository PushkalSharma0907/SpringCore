package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.beans.factory.BeanFactory;  
//import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource; 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config.xml");
        Student student =(Student) context.getBean("a");
        
        System.out.println(student);
        
       
        
     /*   Resource r=new ClassPathResource("ques.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        Question q=(Question)factory.getBean("q");  
        q.displayInfo(); */
        
    }
}
