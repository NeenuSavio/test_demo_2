package com.luv2code.springdemo;

public class BadmintonCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Neenu Spend 60 minutes on  practice";
	}

	@Override
	public String getDailyFortune() {
		
		return null;
	}

}
