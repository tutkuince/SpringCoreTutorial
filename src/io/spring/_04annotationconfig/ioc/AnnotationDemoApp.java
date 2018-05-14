package io.spring._04annotationconfig.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	public static void main(String[] args) {
		// read Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext_04annotationconfig.ioc.xml");

		// retrieve the bean from Spring Container
		TennisCoach thatSillyCoach = context.getBean("thatSillyCoach", TennisCoach.class);

		// call methods on the bean
		System.out.println(thatSillyCoach.getDailyWorkout());

		// close the context
		context.close();
	}
}
