package com.wipro.SpringAssignmentL1_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.Student;
import com.wipro.Movie.Movie;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student s1 = context.getBean("student1", Student.class);
		Student s2 = context.getBean("student2", Student.class);
		s1.display();
		s2.display();
	}
    
}
