package com.yonsai.books;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
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
	
	
	@Around("execution(* com.yonsai.books..*.*(..))")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		
		// 1. [before] 매서드 실행 전 (매개변수)
		Object[] args = joinPoint.getArgs();
		
		for (Object arg : args) {
		System.out.println("--- [AOP PARAM] 매개변수 : " + arg);
		}
		
		// 2. 실제 메서드 호출 
		Object result = joinPoint.proceed();
		
		// 3. 반환값 출력 
		System.out.println("---[AOP RETURN] 반환값: " + result);
		System.out.println("--- AOP 실행 완료");
		return result;
	}
	
}
