package com.springdemo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.coach.Coach;
import com.springdemo.coach.CricketCoach;

public class HelloSpringApp {
	public static void main(String[] args) {
		
//		Load the spring configuration file 
		
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Retrieve bean from spring container
		
		Coach myTrackCoach = context.getBean("trackCoach" , Coach.class);
		Coach myBaseBallCoach = context.getBean("baseballCoach" , Coach.class);
		Coach myGolfCoach = context.getBean("golfCoach" , Coach.class);
		
		CricketCoach myCricketCoach = context.getBean("cricketCoach" , CricketCoach.class);
		
//		call methods on objects created 
		
		System.out.println(myTrackCoach.getDailyWorkout());
		System.out.println(myBaseBallCoach.getDailyWorkout());
		System.out.println(myBaseBallCoach.getDailyFortune());
		
		
		System.out.println(myCricketCoach.getDailyWorkout());
		System.out.println(myCricketCoach.getDailyFortune());
		myCricketCoach.showData();
		System.out.println(myGolfCoach.getDailyWorkout());
		
//		close the context
		
		context.close();
		
		
	}
}
