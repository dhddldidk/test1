package com.dgit.ex4;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass4 {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationStdInfo.xml");
		StudentInfo stdInfo = ctx.getBean(StudentInfo.class);
		stdInfo.getInfo();
		ctx.close();

	}

}
