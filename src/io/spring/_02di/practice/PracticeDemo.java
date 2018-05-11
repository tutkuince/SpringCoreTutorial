package io.spring._02di.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeDemo {
	public static void main(String[] args) {
		// Load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext_02practice.xml");

		// retrieve bean from Spring Container
		Coach coach = context.getBean("theCoach", GolfCoach.class);

		// call methods on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());

		// close the context
		context.close();

	}
}
