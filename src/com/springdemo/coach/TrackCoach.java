package com.springdemo.coach;

import com.springdemo.two.FortuneService;

public class TrackCoach implements Coach {
	private FortuneService myFortuneService;
	
	public TrackCoach(FortuneService myFortuneService) {
		super();
		this.myFortuneService = myFortuneService;
	}
	public TrackCoach() {
		this.myFortuneService = null;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run 5kms now !";
	}
	@Override
	public String getDailyFortune() {
		return myFortuneService.getFortune();
	}
}
