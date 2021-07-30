package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
public class DIApp {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath*:applicationContext.xml");
		OperatorBean operator = (OperatorBean) ctx.getBean("operatorBean");

		int value = operator.calc();

		System.out.println("The result value : " + value);
		ctx.close();
	}
}
