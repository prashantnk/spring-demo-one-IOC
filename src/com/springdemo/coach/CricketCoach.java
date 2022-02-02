package com.springdemo.coach;

import com.springdemo.two.FortuneService;

public class CricketCoach implements Coach {
	private FortuneService fs;
	private String email , teamName ;
	public CricketCoach() {
//		of no use here 
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getTeamName() {
		return teamName;
	}
// setter injection 
	public void setFortuneService(FortuneService fs) {
		this.fs = fs;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice Four ! ";
	}

	@Override
	public String getDailyFortune() {
		return fs.getFortune();
	}
	
	public void showData() {
		System.out.println("Email : " + email);
		System.out.println("TeamName : " + teamName);
	}

}
