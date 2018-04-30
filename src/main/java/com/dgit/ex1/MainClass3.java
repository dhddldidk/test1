package com.dgit.ex1;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dgit.ex3.MyInfo;

public class MainClass3 {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCtx3.xml");
		MyInfo myInfo = ctx.getBean(MyInfo.class);
		myInfo.printInfo();
		ctx.close();
	}
}
