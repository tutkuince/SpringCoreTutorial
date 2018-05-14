package io.spring._05beanscopeswithannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// for singleton object
public class AnnotationBSDemoApp {
	public static void main(String[] args) {
		// Load the Spring Configure file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext_05beanscopeswithannotations.scope.xml");

		// Retrieve the Bean from the Spring Container
		FootballCoach footballCoach = context.getBean("footballCoach", FootballCoach.class);
		FootballCoach fatihTerim = context.getBean("footballCoach", FootballCoach.class);

		// check if they are same
		boolean result = (footballCoach == fatihTerim);

		// print results
		System.out.println("\nPointing the same object: " + result);
		System.out.println("\nMemory location for footballCoach: " + footballCoach);
		System.out.println("\nMemory location for fatihTerim: " + fatihTerim);

		// Close the content
		context.close();
	}
}
