package io.spring._04annotationconfig.ioc;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach") // thatSillyCoach is bean id;
public class TennisCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
}
