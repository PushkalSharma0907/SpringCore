import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.first.Const;
import com.first.basic;

public class first {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("first.xml");
		basic c =(basic) context.getBean("ab");
		System.out.println(c );
		System.out.println(c.getA());
		System.out.println(c.getB() );
		System.out.println(c.getC());
	
	basic c1 =(basic) context.getBean("ab1");
	System.out.println(c1 );
	System.out.println(c1.getA());
	System.out.println(c1.getB() );
	System.out.println(c1.getC());
	
	
	Const c2 =(Const) context.getBean("ob1");
	System.out.println(c2 );
	c2.show();
	
	Const c3 =(Const) context.getBean("ob2");
	System.out.println(c3 );
	c3.show();
	
}
}

