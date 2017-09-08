package com.spring.TestAround;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect 
public class AroundAspectBean {
	
	@Around("execution(public * *(..))")
	public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {
        
		long start = System.currentTimeMillis();
        System.out.println("Running before advice...");
        try{
            Object result = joinPoint.proceed();
            
            System.out.println("Running after advice...");
            long elapsedTime = System.currentTimeMillis() - start;
            System.out.println("Method execution time: " + elapsedTime + " milliseconds.");
            return result;
        } catch(Exception ne){
            throw ne;
        }
    }

}
