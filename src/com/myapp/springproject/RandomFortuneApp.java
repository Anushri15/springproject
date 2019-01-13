/**
 * 
 */
package com.myapp.springproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author anushrinayak
 *
 */
public class RandomFortuneApp {

	/**
	 * This is the main method for RandomFotuneApp
	 */
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach trackCoach = context.getBean("myTrackCoach", Coach.class);

		System.out.println("Testing Random Fortune Class " + trackCoach.getDailyFortune());
		context.close();

	}

}
