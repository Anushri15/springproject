/**
 * 
 */
package com.beanlifecycle.springproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author anushrinayak Created new Package and main class to demonstate Bean
 *         lifecycle
 */
public class BeanScopeApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanlifecycleapplicationContext.xml");

		Coach coach = context.getBean("cricketCoach", Coach.class);
		//System.out.println(coach.getDailyFortune());
		//System.out.println(coach.getDailyWorkout());
		
		
		Coach cricketCoach = context.getBean("cricketCoach", Coach.class);
		//System.out.println(coach.getDailyFortune());
		//System.out.println(coach.getDailyWorkout());
		
		boolean result = (coach==cricketCoach);
		
		System.out.println("Pointing to the same address "+ result);
		System.out.println("coach addderess " + coach);
		System.out.println("cricketCoach address "+ cricketCoach);
		context.close();

	}

}
