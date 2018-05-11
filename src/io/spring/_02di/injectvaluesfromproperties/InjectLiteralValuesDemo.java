package io.spring._02di.injectvaluesfromproperties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.spring._02di.injectliteralvalues.FitnessCoach;

public class InjectLiteralValuesDemo {
	public static void main(String[] args) {
		// Load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext_02injectvaluesfromprop.xml");
		
		// retrieve bean from Spring container
		FitnessCoach coach = context.getBean("fitnessCoach", FitnessCoach.class);
		
		// call methods on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		// call properties on the bean
		System.out.println("E-mail: " + coach.getEmail());
		System.out.println("Team: " + coach.getTeam());
		
		// close the context
		context.close();
	}
}
