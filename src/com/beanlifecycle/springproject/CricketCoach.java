/**
 * 
 */
package com.beanlifecycle.springproject;

/**
 * @author anushrinayak
 *
 */
public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public void cricketCoachInitiated() {
		System.out.println("Cricket coach is initiated");
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Cricket : Workout";
	}

	@Override
	public String getDailyWorkout() {

		return fortuneService.getDailyFortune();
	}

	public void cricketCoachDestroyed() {
		System.out.println("Cricket coat destroyed");
	}
}
