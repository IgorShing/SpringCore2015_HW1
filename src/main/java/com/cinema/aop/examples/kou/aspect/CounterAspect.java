package com.cinema.aop.examples.kou.aspect;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.cinema.manager.model.Event;

@Aspect
public class CounterAspect {

	private Map<String, Integer>	eventNameCallCounters	= new HashMap<String, Integer>();

	@Before("getEventName() && getAllEventMethods()")
	public void getEventNameAdvice(JoinPoint joinPoint) {

		System.out.println(joinPoint.getTarget().getClass().getSimpleName());
		Object obj = joinPoint.getTarget();

		if (obj instanceof Event) {

			String eventName = ((Event) obj).getName();
			if (eventNameCallCounters.containsKey(eventName)) {
				eventNameCallCounters.put(eventName,
						eventNameCallCounters.get(eventName) + 1);
			} else {
				eventNameCallCounters.put(eventName, 1);
			}
		}

	}

	@Pointcut("execution(* get*(..))")
	public void getEventName() {
	}

	@Pointcut("within(com.cinema.manager.model.Event)")
	public void getAllEventMethods() {

	}

	public Map<String, Integer> getEventNameCallCounters() {
		return eventNameCallCounters;
	}

	public void setEventNameCallCounters(
			Map<String, Integer> eventNameCallCounters) {
		this.eventNameCallCounters = eventNameCallCounters;
	}

}
