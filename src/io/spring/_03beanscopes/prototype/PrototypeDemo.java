package io.spring._03beanscopes.prototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.spring._02di.constructorinjection.Coach;
import io.spring._02di.setterinjection.CricketCoach;

public class PrototypeDemo {
	public static void main(String[] args) {
		// Load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext_03beanScope.prototype.xml");

		// retrieve bean from Spring Container
		Coach alphaCoach = context.getBean("theCoach", CricketCoach.class);
		Coach betaCoach = context.getBean("theCoach", CricketCoach.class);

		// check if they are same
		boolean result = (alphaCoach == betaCoach);

		// print the result
		System.out.println("\nPointing the same object: " + result);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		System.out.println("\nMemory location for betaCoach: " + betaCoach);

		// close context
		context.close();
	}
}
