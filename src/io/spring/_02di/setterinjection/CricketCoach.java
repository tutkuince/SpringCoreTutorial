package io.spring._02di.setterinjection;

import io.spring._02di.constructorinjection.Coach;
import io.spring._02di.constructorinjection.FortuneService;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Quickfire stump hitting.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
