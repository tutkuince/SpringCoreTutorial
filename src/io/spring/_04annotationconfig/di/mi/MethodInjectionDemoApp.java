package io.spring._04annotationconfig.di.mi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodInjectionDemoApp {
	public static void main(String[] args) {
		// Load Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_04annotationconfig.di.si.xml");
		
		// Retrieve the Bean from Spring Container
		TrackCoach trackCoach = context.getBean("trackCoach", TrackCoach.class);
		
		// Call methods on the Bean
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(trackCoach.getDailyFortune());
		
		// Close the context
		context.close();
	}
}
