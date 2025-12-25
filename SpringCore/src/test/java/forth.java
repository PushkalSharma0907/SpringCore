import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.forth.autowireViaXml;

public class forth {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("forth.xml");

		autowireViaXml avx = context.getBean("ab1", autowireViaXml.class);

	    System.out.println(avx);
		
	    autowireViaXml avx1 = context.getBean("ab2", autowireViaXml.class);
	    
	    System.out.println(avx1);
	    
	    autowireViaXml avx2 = context.getBean("ab3", autowireViaXml.class);
	    
	    System.out.println(avx2);
	    
		
	}

}
