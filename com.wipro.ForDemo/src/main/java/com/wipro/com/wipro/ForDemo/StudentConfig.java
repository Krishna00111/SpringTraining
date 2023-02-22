package com.wipro.com.wipro.ForDemo;

public class StudentConfig {
	
	@Bean(initMethod="initialize", destroyMethod="destroy")
	//@bean(initmethod-"initialize", destroyMethods-"destroy")
	@Bean
	//Scope['prototype')
	public Student student() {
		return new Student(new Address());
	}

}
