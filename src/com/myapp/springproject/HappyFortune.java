/**
 * 
 */
package com.myapp.springproject;

/**
 * @author anushrinayak
 *
 */
public class HappyFortune implements FortuneService{

	@Override
	public String getFortune() {
		return "Today is your lucky day !!!";
	}

}
