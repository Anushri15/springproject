/**
 * 
 */
package com.myapp.springproject;

import java.util.Random;

/**
 * @author anushrinayak This class implements Fortune Interface, were we give
 *         randam fortune defined in this class
 */
public class RandomFortuneServiceImpl implements FortuneService {

	/*
	 * (non-Javadoc) This functionality has 3 arrays of type String , any Random
	 * array would be returned.
	 */
	private Random randomGenerator = new Random();
	private String fortuneArray[] = { "Its going to be bit challenging today do not lose hopes stay strong !!!",
			"Today everything is in your favor", "Beaware of the wolf in the sheep's clothing" };

	@Override
	public String getFortune() {

		int indToPick = randomGenerator.nextInt(fortuneArray.length);

		return fortuneArray[indToPick];

	}

}
