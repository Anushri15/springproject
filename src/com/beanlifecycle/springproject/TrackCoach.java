/**
 * 
 */
package com.beanlifecycle.springproject;

/**
 * @author anushrinayak
 *
 */
public class TrackCoach implements Coach {

	/*
	 * Track coach class implements Coach class. I will be creating bean for Coach
	 * interface
	 */

	private FortuneService fortuneservice;

	public TrackCoach(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.myapp.springproject.Coach#getDailyFortune()
	 */
	@Override
	public String getDailyFortune() {
		return fortuneservice.getDailyFortune();
	}

	@Override
	public String getDailyWorkout() {

		return "Make sure you workout for an hour";
	}

}
