package io.spring._04annotationconfig.di.si;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringDemoApp {
	public static void main(String[] args) {
		// Load Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_04annotationconfig.di.si.xml");
		
		// Retrieve the bean from the Spring Container
		BaseballCoach baseballCoach = context.getBean("baseballCoach", BaseballCoach.class);
		
		// Call methods on the Bean
		System.out.println(baseballCoach.getDailyWorkout());
		System.out.println(baseballCoach.getDailyFortune());
		
		// Close the context
		context.close();
	}
}
