import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
package com.wipro.Movie;


public class Aspect1 implements AfterReturningAdvice{
	
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3)throws Throwable{
		
		System.out.println("You are in after returning advice method called by"+arg1.getName());
		
}

}
