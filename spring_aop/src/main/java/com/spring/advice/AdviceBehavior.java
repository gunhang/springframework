package com.spring.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdviceBehavior {
	
	public void 양치() {
		String 양치 = "양치";
		System.out.println(양치);
	}
	
	public void chikachikaAround(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("한번 닦았는데...");
		
		joinPoint.proceed();
		System.out.println("또 닦아요!!!!!");
	}
}
