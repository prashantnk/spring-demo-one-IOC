package com.springdemo.one;

import com.springdemo.two.RandomFortuneService;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World 3!");
		
//		Coach coach = new TrackCoach(null);
//		System.out.println(coach.getDailyWorkout());
		
		RandomFortuneService rfs = new RandomFortuneService();
		System.out.println(rfs.getFortune());
	}

}
