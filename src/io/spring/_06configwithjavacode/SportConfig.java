package io.spring._06configwithjavacode;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import io.spring._04annotationconfig.di.ci.Coach;
import io.spring._04annotationconfig.di.ci.FortuneService;

@Configuration
//@ComponentScan("io.spring._06configwithjavacode")
public class SportConfig {
	// define a bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	
	// define a bean for our swim coach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
