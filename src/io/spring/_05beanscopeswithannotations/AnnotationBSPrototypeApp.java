package io.spring._05beanscopeswithannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBSPrototypeApp {
	public static void main(String[] args) {
		// Load the Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext_05beanscopeswithannotations.scope.xml");

		// Retrieve the Bean from Spring Container
		BasketballCoach theCoach = context.getBean("basketballCoach", BasketballCoach.class);
		BasketballCoach bCoach = context.getBean("basketballCoach", BasketballCoach.class);

		// check if they are same
		boolean result = (theCoach == bCoach);

		// print results
		System.out.println("\nPointing the same object: " + result);
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for bCoach: " + bCoach);

		// close the context
		context.close();

	}
}
