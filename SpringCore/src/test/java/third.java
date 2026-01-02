import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.third.lifeCycleMethod;
import com.third.viaAnnotation;
import com.third.viaInterface;

public class third {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("third.xml");
		
		// via method
		lifeCycleMethod obj = (lifeCycleMethod) context.getBean("ob1");
		
		System.out.println(obj);		
		context.registerShutdownHook();  //is used to call the destroy method
		
		// viaInterface
		viaInterface obj2 = (viaInterface) context.getBean("ob2");
		System.out.println(obj2);
		
		// viaAnnotation
		viaAnnotation obj3 = (viaAnnotation) context.getBean("ob3");
		System.out.println(obj3);
	}

}
