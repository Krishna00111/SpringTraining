package com.wipro.Movie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPDemo {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
				EmpInterface emp = (EmpInterface)ctx.getBean("bdcproxy");
		        emp.display();
		        System.out.println("--invoking set method---");
		        emp.setName("chinmay");
		        emp.display(); 
		        
		        System.out.println("--CDC--");
		        emp = (EmpInterface)ctx.getBean("cdcproxy");
		        emp.display();
		        System.out.println("--Invoking set method of CDC--");
		        emp.setName("");
		        emp.display();
	}

}
