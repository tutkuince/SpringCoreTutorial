package io.spring._04annotationconfig.di.ci;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringDemoApp {
	public static void main(String[] args) {
		// load Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_04annotationconfig.di.ci.xml");
		
		// retrieve the bean from Spring Container
		TennisCoach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);
		
		// call methods on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
		
		// close the context
		context.close();
	}
}
