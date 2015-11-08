package com.cinema.aop.examples.kou.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allGetters() && allCircleMethods()")
	public void loggingAdvice() {
		System.out.println("Running logging aspect. Get method called");
	}

	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Running second aspect. Get method called");
	}

	@Pointcut("execution(* get*(..))")
	public void allGetters() {
	}

	@Pointcut("within(com.cinema.aop.examples.kou.model.Circle)")
	public void allCircleMethods() {
	}

	@Pointcut("args(name)")
	public void byName(String name) {

	}
}
