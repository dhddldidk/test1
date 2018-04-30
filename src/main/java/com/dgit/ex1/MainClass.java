package com.dgit.ex1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		//자바에서 하는 방법
		
		/*MyCalculator my = new MyCalculator();
		my.setCalculator(new Calculator());
		my.setNum1(10);
		my.setNum2(5);
		
		my.add();
		my.sub();
		my.mul();
		my.div();*/
		
		//Spring에서 하는 방법
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCtx.xml");
		MyCalculator my = ctx.getBean(MyCalculator.class);
		my.add();
		my.sub();
		my.mul();
		my.div();
		
		
		ctx.close();
		
	}
}
