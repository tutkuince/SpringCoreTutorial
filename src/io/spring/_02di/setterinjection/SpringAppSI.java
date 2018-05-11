package io.spring._02di.setterinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.spring._02di.constructorinjection.Coach;

public class SpringAppSI {
	public static void main(String[] args) {
		
		// load the spring configuration file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_02si.xml");
		
		// retrieve bean from spring container
		Coach coach = context.getBean("cricketCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		// close the context
		context.close();
	}
}
