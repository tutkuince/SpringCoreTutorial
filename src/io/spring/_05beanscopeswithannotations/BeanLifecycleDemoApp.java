package io.spring._05beanscopeswithannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {
	public static void main(String[] args) {
		// Load the Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext_05beanscopeswithannotations.scope.xml");

		// Retrieve the Bean from the Spring Container
		CricketCoach theCoach = context.getBean("cricketCoach", CricketCoach.class);

		// Call methods on the Bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		// Close the context
		context.close();
	}
}
