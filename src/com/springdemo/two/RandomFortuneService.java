package com.springdemo.two;

public class RandomFortuneService implements FortuneService {
	private String[] fortunes = { "You will get an \"A\" on a test.", "You will be rich.",
			"Good fortune will be yours." };	

	@Override
	public String getFortune() {
		int ind = (int)(Math.random()*10)%3;
		return fortunes[ind];
	}
}
