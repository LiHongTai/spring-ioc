package com.cto.spring_ioc.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

public class LoggerAspect {
	
	public void beforeMethod(JoinPoint joinpoint) {
		String methodName = joinpoint.getSignature().getName();
		Object[] args = joinpoint.getArgs();
		System.out.println("The method " + methodName + " begins with " + Arrays.asList(args) );
	}

}
