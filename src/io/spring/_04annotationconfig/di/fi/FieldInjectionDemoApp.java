package io.spring._04annotationconfig.di.fi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FieldInjectionDemoApp {
	public static void main(String[] args) {
		// Load Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_04annotationconfig.di.fi.xml");
		
		// Retrieve the Bean from the Spring Container
		YogaCoach yogaCoach = context.getBean("yogaCoach", YogaCoach.class);
		
		// Call the methods on the Bean
		System.out.println(yogaCoach.getDailyWorkout());
		System.out.println(yogaCoach.getDailyFortune());
		
		// Close the context
		context.close();
	}
}
