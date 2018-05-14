package io.spring._05beanscopeswithannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import io.spring._04annotationconfig.di.ci.Coach;
import io.spring._04annotationconfig.di.ci.FortuneService;

@Component
@Scope("prototype")	// new instance for every request
public class BasketballCoach implements Coach {
	@Autowired
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Jump jump jump";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
