package io.spring._06configwithjavacode.injectvalueswithprop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import io.spring._04annotationconfig.di.ci.Coach;
import io.spring._04annotationconfig.di.ci.FortuneService;
import io.spring._04annotationconfig.di.ci.HappyFortuneService;

@Configuration
@PropertySource("classpath:/io/spring/_06configwithjavacode/injectvalueswithprop/sport.properties")
public class CoachConfig {

	// Define a bean for HappyFortuneService
	@Bean
	public FortuneService theFortune() {
		return new HappyFortuneService();
	}

	// Define a bean for our FootballCoach and inject dependency
	@Bean
	public Coach footballCoach() {
		return new FootballCoach(theFortune());
	}
}
