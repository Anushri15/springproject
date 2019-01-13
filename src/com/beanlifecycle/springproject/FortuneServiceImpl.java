package com.beanlifecycle.springproject;

import java.util.Random;

public class FortuneServiceImpl implements FortuneService {

	private Random randomAccess = new Random();
	
	private String fortunesArray[] = { "Beaware today there can be wolfs in sheep's clothing",
								 	   "Do not underestimate your potential, give your best",
									   "Today is your lucky day !!! enjoy"};
	
	@Override
	public String getDailyFortune() {
		int index = randomAccess.nextInt(fortunesArray.length);
		return fortunesArray[index];
	}

}
