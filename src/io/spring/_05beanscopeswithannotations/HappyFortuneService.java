package io.spring._05beanscopeswithannotations;

import org.springframework.stereotype.Component;

import io.spring._04annotationconfig.di.ci.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}
}
