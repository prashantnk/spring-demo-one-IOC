package com.springdemo.coach;

import com.springdemo.two.FortuneService;

public class BaseballCoach implements Coach{
	
	private FortuneService myFortuneService;
	
	public BaseballCoach(FortuneService myFortuneService) {
		this.myFortuneService = myFortuneService;
	}
	public BaseballCoach() {
		this.myFortuneService = null;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do batting !";
	}

	@Override
	public String getDailyFortune() {
		return myFortuneService.getFortune();
	}
}
