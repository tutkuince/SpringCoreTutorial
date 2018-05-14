package io.spring._06configwithjavacode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
	public static void main(String[] args) {
		// Load Spring Configuration java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Retrieve the Bean from Container
		TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
		
		// Call methods on the Bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// close context
		context.close();
	}
}
