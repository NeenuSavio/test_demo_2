package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneservice;
	
	//define a constructor for the dependency injection
	
	public BaseballCoach(FortuneService theFortuneService) {
		
		fortuneservice = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Neenu needs to Spend 30 minutes on batting practice";
		
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneservice.getFortune();
	}

}
