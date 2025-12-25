import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.fifth.beanScope;
import com.sixth.XmlRepWOC;
import com.sixth.XmlReplaceClass;
import com.sixth.withoutComponent;
import com.sixth.withoutXml;


public class sixth {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(XmlReplaceClass.class);

	    withoutXml c1 = context.getBean("obj", withoutXml.class);
	    
	    c1.display();
	    
	    ApplicationContext context1 = new AnnotationConfigApplicationContext(XmlRepWOC.class);
	    
	    withoutComponent c = context1.getBean("getobj", withoutComponent.class);
	    
	    c.display();
	    
	    
	    
		

		
	}

}

