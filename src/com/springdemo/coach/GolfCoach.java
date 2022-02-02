package com.springdemo.coach;

import com.springdemo.two.FortuneService;

public class GolfCoach implements Coach {
	private FortuneService myFortuneService;
	
	public GolfCoach(FortuneService myFortuneService) {
		super();
		this.myFortuneService = myFortuneService;
	}
	public GolfCoach() {
		this.myFortuneService = null;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do Golf here !";
	}

	@Override
	public String getDailyFortune() {
		return myFortuneService.getFortune();
	}

}
