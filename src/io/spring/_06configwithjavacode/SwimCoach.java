package io.spring._06configwithjavacode;

import io.spring._04annotationconfig.di.ci.Coach;
import io.spring._04annotationconfig.di.ci.FortuneService;


public class SwimCoach implements Coach {
	private FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
