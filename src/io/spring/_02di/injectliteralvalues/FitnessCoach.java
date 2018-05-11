package io.spring._02di.injectliteralvalues;

import io.spring._02di.constructorinjection.Coach;
import io.spring._02di.constructorinjection.FortuneService;

public class FitnessCoach implements Coach {
	private String email;
	private String team;
	private FortuneService fortuneService;

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 20 minutes before training";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
