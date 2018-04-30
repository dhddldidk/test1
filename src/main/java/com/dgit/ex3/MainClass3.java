package com.dgit.ex3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass3 {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCtx3.xml");
		MyInfo myInfo = ctx.getBean(MyInfo.class);
		myInfo.printInfo();
		ctx.close();
	}
}
