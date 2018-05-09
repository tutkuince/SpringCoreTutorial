package io.spring._01ioc.roughprototype;

public class MyApp {
	public static void main(String[] args) {
		
		// create the object
		// Coach theCoach = new BaseballCoach();
		Coach theCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());
	}
}
