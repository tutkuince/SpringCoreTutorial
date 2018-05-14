package io.spring._06configwithjavacode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.spring._04annotationconfig.di.ci.Coach;
import io.spring._04annotationconfig.di.ci.FortuneService;

@Component
public class TennisCoach implements Coach{
	@Autowired
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
