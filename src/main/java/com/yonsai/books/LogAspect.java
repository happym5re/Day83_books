package com.yonsai.books;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

		//패키지 내부의 모든 메서드에 로그 실행
	@Before("execution(* com.yonsai.books..*.*(..))")
	public void beforeLog() {
		System.out.println("---AOP: 메서드 실행 전 로그");
	}
	
	
	@After("execution(* com.yonsai.books..*.*(..))")
	public void afterLog() {
		System.out.println("---AOP: 메서드 실행 완료");
	}
	
	
}
