import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.fifth.My_component;
import com.fifth.beanScope;


public class fifth {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("fifth.xml");

	    My_component c1 = context.getBean("compo", My_component.class);
	    
	    System.out.println(c1);
	    
		SpelExpressionParser t = new SpelExpressionParser();
		Expression a = t.parseExpression("10 + 20");
		System.out.println(a.getValue());
		
		//same hashcode for singleton scope
		beanScope b1 = context.getBean("ob", beanScope.class);
		System.out.println(b1.hashCode());
		beanScope b2 = context.getBean("ob", beanScope.class);
		System.out.println(b2.hashCode());
		
		//different hashcode for prototype scope
		beanScope b3 = context.getBean("ob1", beanScope.class);
		System.out.println(b3.hashCode());
		beanScope b4 = context.getBean("ob1", beanScope.class);
		System.out.println(b4.hashCode());

		
	}

}

