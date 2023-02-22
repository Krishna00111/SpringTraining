package com.wipro.Movie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    	Movie s1 = (Movie)ctx.getBean("movie");
    	Movie s2 = (Movie)ctx.getBean("movie");
    	Movie s3 = (Movie)ctx.getBean("movie");
        
    	System.out.println(s1.getMovieId());
    	System.out.println(s2.getMovieName());
    	System.out.println(s3.getMovieActor()); 
    	}
}
