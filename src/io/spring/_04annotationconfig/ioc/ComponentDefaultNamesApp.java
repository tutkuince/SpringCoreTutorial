package io.spring._04annotationconfig.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentDefaultNamesApp {
	public static void main(String[] args) {
		// Read Spring configuration file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_04annotationconfig.ioc.xml");
		
		// Retrieve the bean from the Spring Container
		GymCoach gymCoach = context.getBean("gymCoach", GymCoach.class); // spring creates default id for GymCoach
		
		// call methods on the bean
		System.out.println(gymCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}
}
