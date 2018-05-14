package io.spring._06configwithjavacode.injectvalueswithprop;

import org.springframework.beans.factory.annotation.Value;

import io.spring._04annotationconfig.di.ci.Coach;
import io.spring._04annotationconfig.di.ci.FortuneService;

public class FootballCoach implements Coach {
	private FortuneService fortuneService;

	@Value(value = "${sport.email}")
	private String email;

	@Value(value = "${sport.team}")
	private String team;

	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Hit the ball";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
