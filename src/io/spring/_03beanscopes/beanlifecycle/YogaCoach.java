package io.spring._03beanscopes.beanlifecycle;

import io.spring._02di.constructorinjection.Coach;
import io.spring._02di.constructorinjection.FortuneService;

public class YogaCoach implements Coach {
	private FortuneService fortuneService;

	public YogaCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Take a deep breath 30 times in 1 second";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	// add a initialization method
	public void doMyStartupSetup() {
		System.out.println("YogaCoach: inside method doMyStartupSetup (init)");
	}
	
	
	// add a destroy method
	public void doMyCleanupSetup() {
		System.out.println("YogaCoach: inside method doMyStartupSetupYoYo (destroy)");
	}
}
