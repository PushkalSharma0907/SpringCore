package com.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class BankApp {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Manager manager = context.getBean(Manager.class);
//		manager.callMetting();
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("satendra.xml");
//		janved student = context.getBean(janved.class);
//		student.show();
		
		Resource r=new ClassPathResource("satendra.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        janved s=(janved)factory.getBean("f");  
        s.show();
	}
}
