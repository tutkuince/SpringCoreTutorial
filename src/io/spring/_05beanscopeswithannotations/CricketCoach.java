package io.spring._05beanscopeswithannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.spring._04annotationconfig.di.ci.Coach;
import io.spring._04annotationconfig.di.ci.FortuneService;

@Component
public class CricketCoach implements Coach {
	@Autowired
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Quickfire stump hitting.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@PostConstruct
	public void initBean() {
		System.out.println("CricketCoach initializing. . . ");
		System.out.println("-----------------------------------");
	}

	@PreDestroy
	public void destroyBean() {
		System.out.println("-----------------------------------");
		System.out.println("CricketCoach destroyed!");
	}
}
