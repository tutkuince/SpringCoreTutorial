package io.spring._04annotationconfig.di.qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import io.spring._04annotationconfig.di.ci.Coach;
import io.spring._04annotationconfig.di.ci.FortuneService;

@Component
public class TennnisCoach implements Coach{
	@Autowired
	@Qualifier("randomService")
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
