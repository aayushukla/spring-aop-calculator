package com.capgemini.spring.calculator.aspect;

import org.aspectj.lang.annotation.*;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.*;

@Component
@Aspect
public class AspectCal {
	
	@Around("execution (* com.capgemini.spring.calculator.Calculator.add(..))")
	public void addAspect(ProceedingJoinPoint pjp) throws Throwable {
	
	Object args[]=pjp.getArgs();
	int num1=Integer.parseInt(args[0].toString());
	int num2=Integer.parseInt(args[1].toString());
	if(num1>0 && num2>0) 
		pjp.proceed();
	else
		System.out.println("Values entered should be greater than 0");
	}

	@Around("execution (* com.capgemini.spring.calculator.Calculator.divide(..))")
	public void divideAspect(ProceedingJoinPoint pjp) throws Throwable {
	Object args[]=pjp.getArgs();
	double num2=Double.parseDouble(args[1].toString());
	if(num2!=0) 
		pjp.proceed();
	else
		System.out.println("Values entered should be greater than 0");
	}
}