package com.springdemo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		
//		Load the spring configuration file 
		
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Retrieve bean from spring container
		
		Coach myTrackCoach = context.getBean("trackCoach" , Coach.class);
		Coach myBaseBallCoach = context.getBean("baseballCoach" , Coach.class);
		Coach myGolfCoach = context.getBean("golfCoach" , Coach.class);
		
//		call methods on spring
		
		System.out.println(myTrackCoach.getDailyWorkout());
		System.out.println(myBaseBallCoach.getDailyWorkout());
		System.out.println(myGolfCoach.getDailyWorkout());
		
//		close the context
		
		context.close();
		
		
	}
}
