package io.spring._01ioc.idealsolution;

public class StrengthCoach implements Coach{
	@Override
	public String getDailyWorkout() {
		return "Do deadlift to 3 x 20 times";
	}
}
