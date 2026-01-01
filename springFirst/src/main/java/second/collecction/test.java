package second.collecction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class test {

	public static void main(String[] args) {
		
		 ApplicationContext context1 = new ClassPathXmlApplicationContext("second/collection/ques.xml");
         Ques q =(Ques) context1.getBean("q");
        
        q.displayInfo();
		
	}

}
