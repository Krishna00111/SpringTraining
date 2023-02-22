package com.wipro.com.wipro.ForDemo;
import org.springframework.context.ApplicationContext; 

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplication(StudentConfig.class);
		Student stud = ctx.getBean(Student.class);
		System.out.println(stud.getId());//10
		stud.showAddressOfStudent();
		
		stud.setId(30);
		System.out.println(stud.getId());//30
		
		Student stud2 = (Student).ctx.getBean(Student.class);
		System.out.println(stud2.getId());//30
		
		//ctx.registerShutdownHook();
		//ctx.close();
	}

}
/* 
 * 
 * 
 * 
 * 
 */
 * 
