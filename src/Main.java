package com.capgemini.spring.main;



import com.capgemini.spring.calculator.*;


import org.springframework.context.ApplicationContext;


import org.springframework.context.support.ClassPathXmlApplicationContext;








public class Main {
		public static void main(String[] args) {


		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");


		Calculator calculator = context.getBean(Calculator.class);
		calculator.add(10,20);
		calculator.divide(8.0,2.0);
	}






}
