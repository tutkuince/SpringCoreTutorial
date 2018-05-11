package io.spring._02di.injectliteralvalues;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectLiteralsDemo {
	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext_02injectliteral.xml");
		
		// retrieve bean from spring container
		FitnessCoach coach = context.getBean("fitnessCoach", FitnessCoach.class);
		
		// call methods on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());

		// show properties on FitnessCoach
		System.out.println("E-mail: " + coach.getEmail());
		System.out.println("Team: " + coach.getTeam());
		
		
		// close the context
		context.close();
	}
}
