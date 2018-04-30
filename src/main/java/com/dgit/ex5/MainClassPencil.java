package com.dgit.ex5;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClassPencil {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCtx5.xml");
		
		/*인터페이스를 써서 pencil을 만들었지만
		resources에는 4B만 등록되어 있기 때문에 "4B연필입니다."라고 출력됨*/
		
		Pencil p = ctx.getBean(Pencil.class);
		p.use();
		ctx.close();

	}

}
