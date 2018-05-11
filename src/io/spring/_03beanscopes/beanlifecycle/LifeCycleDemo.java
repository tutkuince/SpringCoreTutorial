package io.spring._03beanscopes.beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.spring._02di.constructorinjection.Coach;

public class LifeCycleDemo {
	public static void main(String[] args) {
		// Load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_03beanScope.lifecycle.xml");
		
		// retrieve bean from Spring Container
		Coach coach = context.getBean("theCoach", YogaCoach.class);
		
		// Call methods on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		// close context
		context.close();
	}
}
