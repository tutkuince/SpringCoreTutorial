package io.spring._04annotationconfig.ioc;

import org.springframework.stereotype.Component;

@Component	// default id is gymCoach
public class GymCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Curl the bar 3 x 10 times";
	}
}
