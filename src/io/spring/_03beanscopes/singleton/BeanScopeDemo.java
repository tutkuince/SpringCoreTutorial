package io.spring._03beanscopes.singleton;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.spring._02di.constructorinjection.Coach;
import io.spring._02di.setterinjection.CricketCoach;

public class BeanScopeDemo {
	public static void main(String[] args) {
		// Load Spring configuration file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_03beanScope.xml");
		
		// retrieve bean from Spring Container
		Coach theCoach = context.getBean("theCoach", CricketCoach.class);
		
		Coach alphaCoach = context.getBean("theCoach", CricketCoach.class);
		
		// check if they are same
		boolean result = (theCoach == alphaCoach);
		
		// print results
		System.out.println("\nPointing the same object: " + result);
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		
		
		// close context
		context.close();
	}
}
