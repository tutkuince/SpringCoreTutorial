package io.spring._06configwithjavacode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.spring._04annotationconfig.di.ci.Coach;

public class JavaConfigDemoApp2 {
	public static void main(String[] args) {
		// Load the Spring Configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// Retrieve the Bean from Spring Container
		Coach swimCoach = context.getBean("swimCoach", Coach.class);

		// Call methods on the Bean
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());

		// Close the context
		context.close();
	}
}
