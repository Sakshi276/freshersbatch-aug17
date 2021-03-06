package com.spring.StringOperationsAOP;


import java.util.HashMap;
import java.util.Map;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;


@Aspect 
public class StringAspect {
	
	Map<String,Object> exceptionReport=new HashMap<String,Object>();

	
	 
	 
	 @AfterThrowing(pointcut = "execution(* *(String, ..))", throwing = "e")
	 public void myAfterThrowing(JoinPoint joinPoint, Throwable e) {

		System.out.println("ERROR");
		 	
		   Signature signature = (Signature) joinPoint.getSignature();
		   exceptionReport.put(signature.toString(), e);
		    System.out.println("ex r"+exceptionReport);
		  }
	 

}
