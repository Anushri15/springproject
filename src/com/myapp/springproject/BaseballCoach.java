package com.myapp.springproject;

public class BaseballCoach implements Coach {

	// Define private variable to create dependency injection
	private FortuneService fortuneService;

	public BaseballCoach(FortuneService fortuneServicePassed) {

		fortuneService = fortuneServicePassed;
	}

	@Override
	public String getDailyFortune() {

		// I wil be using the defined dependency injection of fortune class to call the
		// methods

		return fortuneService.getFortune();
	}

	@Override
	public String getMyDailyWorkout() {
		return "Spend 30 mins on batting practice";
	}
}
