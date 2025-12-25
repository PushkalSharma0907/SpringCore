import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.second.ambiguity;
import com.second.collecction;
import com.second.refer;

public class second {

	public static void main(String[] args) {
		
		//collecction class
		ApplicationContext context = new ClassPathXmlApplicationContext("second.xml");
		collecction c = (collecction) context.getBean("ob1");
		System.out.println(c.getName());
		System.out.println(c.getAns());
		System.out.println(c.getAns1());
		System.out.println(c.getAns2());
		
		// refer class
		refer c1 = (refer) context.getBean("ob2");
		System.out.println(c1.getA());
		System.out.println(c1.getCollect());
		
		// ambiguity class
		ambiguity a = context.getBean("ob3", ambiguity.class);
		a.display();
		
		ambiguity b = context.getBean("ob4", ambiguity.class);
		b.display();
		
			
	}

}
