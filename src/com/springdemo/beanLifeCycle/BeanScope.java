package com.springdemo.beanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.coach.Coach;

public class BeanScope {

	public static void main(String[] args) {
		
//		loading context
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext-beanScope.xml");
		// here second argument will overwrite the bean definition 
		
//		retrieve beans
		
		Coach coach1 = context.getBean("baseballCoach" , Coach.class);
		Coach coach2 = context.getBean("baseballCoach" , Coach.class);
//		
		System.out.println(coach1 == coach2);
		
		coach1.getDailyWorkout();
		coach2.getDailyWorkout();
		
		context.close();
		
		 
		

	}

}
