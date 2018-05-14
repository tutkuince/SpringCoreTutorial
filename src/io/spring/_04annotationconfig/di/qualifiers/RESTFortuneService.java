package io.spring._04annotationconfig.di.qualifiers;

import org.springframework.stereotype.Component;

import io.spring._04annotationconfig.di.ci.FortuneService;

@Component
public class RESTFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return null;
	}
}
