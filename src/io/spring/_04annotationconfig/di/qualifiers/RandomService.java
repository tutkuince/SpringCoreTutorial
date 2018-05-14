package io.spring._04annotationconfig.di.qualifiers;

import org.springframework.stereotype.Component;

import io.spring._04annotationconfig.di.ci.FortuneService;

@Component
public class RandomService implements FortuneService{
	@Override
	public String getFortune() {
		return "Das ist RandomService";
	}
}
