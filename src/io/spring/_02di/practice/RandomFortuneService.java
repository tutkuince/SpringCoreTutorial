package io.spring._02di.practice;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	// create an array of String
	private String[] fortuneList = { "Beware of the wolf in sheep's clothing", "Diligence is the mother of good luck",
			"The journey is the reward" };

	private Random rnd = new Random();

	@Override
	public String getFortune() {
		// pick a random string from array
		int index = rnd.nextInt(fortuneList.length);
		String theFortune = fortuneList[index];
		return theFortune;
	}
}
