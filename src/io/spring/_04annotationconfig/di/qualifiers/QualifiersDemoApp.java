package io.spring._04annotationconfig.di.qualifiers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifiersDemoApp {
	public static void main(String[] args) {
		// Load Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext_04annotationconfig.di.qualifiers.xml");

		// Retrieve the bean from the Spring Container
		TennnisCoach tennnisCoach = context.getBean("tennnisCoach", TennnisCoach.class);

		// Call the methods on the Bean
		System.out.println(tennnisCoach.getDailyWorkout());
		System.out.println(tennnisCoach.getDailyFortune());

		// Close the context
		context.close();
	}
}
