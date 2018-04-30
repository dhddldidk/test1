package com.dgit.ex1;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dgit.ex2.MyPerson;

public class MainClass2 {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCtx.xml");
		MyPerson p = ctx.getBean(MyPerson.class);
		p.printInfo();
		ctx.close();
	}

}
