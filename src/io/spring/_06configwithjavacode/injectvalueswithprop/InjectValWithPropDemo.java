package io.spring._06configwithjavacode.injectvalueswithprop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectValWithPropDemo {
	public static void main(String[] args) {
		// Load the Spring Configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CoachConfig.class);
		
		// Retrieve the bean from the Spring Container
		FootballCoach coach = context.getBean("footballCoach", FootballCoach.class);
		
		// Call methods on the Bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		// Values in properties file
		System.out.println("E-mail: " + coach.getEmail());
		System.out.println("Team: " + coach.getTeam());
		
		// Close context
		context.close();
	}
}
