/**
 * 
 */
package com.myapp.springproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author anushrinayak
 *
 */
public class MySpringApp {

	/**
	 * This is the main class of the App. Here I am going to load the spring
	 * configuration file though the spring container. Then retrieve the defined
	 * bean from the spring container. Making use of the bean to call method of the
	 * instantiated bean object Then wil be closing the connection to the bean.
	 */
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 Coach coach = context.getBean("myCoach", Coach.class);	
		 System.out.println(coach.getMyDailyWorkout());
		 System.out.println(coach.getDailyFortune());
		
		 
		 Coach trackCoach = context.getBean("myTrackCoach", Coach.class);	
		 System.out.println(trackCoach.getMyDailyWorkout());
		 System.out.println(trackCoach.getDailyFortune());
		 
		 
		 
		 CricketCoach myCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);	
		 System.out.println(myCricketCoach.getMyDailyWorkout());
		 System.out.println(myCricketCoach.getDailyFortune());
		 System.out.println(myCricketCoach.getEmailAddress());
		 System.out.println("Before---"+myCricketCoach.getTeam());
		 
		 myCricketCoach.setTeam("updatedTeam");
		 System.out.println("After----"+myCricketCoach.getTeam());

		 
		 context.close();
		 

		 
		 
		 
	}

}
