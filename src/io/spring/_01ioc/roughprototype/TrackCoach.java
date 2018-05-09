package io.spring._01ioc.roughprototype;

public class TrackCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}
}
