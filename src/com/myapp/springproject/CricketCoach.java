package com.myapp.springproject;

public class CricketCoach implements Coach {

	private FortuneService fortuneservice;
	private String emailAddress;
	private String team;

	public CricketCoach() {

	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneservice) {

		this.fortuneservice = fortuneservice;

	}

	@Override
	public String getMyDailyWorkout() {
		// TODO Auto-generated method stub
		return "getdaily work out!!! ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}

}
