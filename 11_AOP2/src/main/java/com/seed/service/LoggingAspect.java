package com.seed.service;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	
	@Before("execution(* LoanService.*(..))")
	public void before(JoinPoint jp) {
		System.out.println("Entered: "+jp.getSignature().getDeclaringTypeName()+"."+jp.getSignature().getName()+" at "+LocalDateTime.now());
	}
	
	@AfterReturning("execution(* LoanService.*(..))")
	public void after(JoinPoint jp) {
		System.out.println("Exit: "+jp.getSignature().getDeclaringTypeName()+"."+jp.getSignature().getName()+" at "+LocalDateTime.now());
	}
	
	

}
