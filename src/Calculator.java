package com.capgemini.spring.calculator;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.*;

public interface Calculator {
	public void add(int num1, int num2);
	public void divide(double num1, double num2);
}


@Service
class CalculatorImpl implements Calculator {

	public void add(int num1, int num2)
	{
		System.out.println(num1+num2);
	}


	public void divide(double num1, double num2)
	{
		System.out.println(num1/num2);
	}
}