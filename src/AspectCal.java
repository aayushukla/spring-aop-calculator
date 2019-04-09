package com.capgemini.spring.calculator.aspect;

import org.aspectj.lang.annotation.*;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.*;

@Component
@Aspect
public class AspectCal {



	@After("execution (* com.capgemini.spring.calculator.Calculator.add(..))") 
	public void addLog() throws Throwable
	{
		System.out.println("do addition");	
	}

	@Before("execution (* com.capgemini.spring.calculator.Calculator.divide(..))")
	public void divideLog() throws Throwable
	{
		System.out.println("do division");	
	}
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

	@AfterReturning(pointcut = "execution (* com.capgemini.spring.calculator.Calculator.multiply(..))",returning="mul")
	public void multiplyLog(Double mul) throws Throwable
	{
		 
		System.out.println(mul);	
	}
	
}