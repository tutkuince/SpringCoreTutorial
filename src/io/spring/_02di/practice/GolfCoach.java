package io.spring._02di.practice;

public class GolfCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Hit the ball 100 times with your friend.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
