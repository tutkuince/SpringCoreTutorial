package io.spring._06configwithjavacode;

import io.spring._04annotationconfig.di.ci.FortuneService;

public class SadFortuneService implements FortuneService{
	@Override
	public String getFortune() {
		return "Today is a sad day.";
	}
}
