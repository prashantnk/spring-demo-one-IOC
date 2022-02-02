package com.springdemo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.coach.Coach;

public class SpringAppTwo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		var cricketCoach = context.getBean("cricketCoach" , Coach.class);
		
		System.out.println(cricketCoach.getDailyFortune());
		
		context.close();

	}

}
