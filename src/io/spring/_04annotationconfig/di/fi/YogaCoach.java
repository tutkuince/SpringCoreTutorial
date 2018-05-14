package io.spring._04annotationconfig.di.fi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import io.spring._04annotationconfig.di.ci.Coach;
import io.spring._04annotationconfig.di.ci.FortuneService;

@Component
public class YogaCoach implements Coach {
	@Autowired
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Take a deep breath 30 times in 1 second";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
