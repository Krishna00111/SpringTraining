

package com.wipro.com.wipro.ForDemo;

public class Student {
	
	@Value("10")
	private int id;
	
	private Address addrs;
	
	public Student(Address adr) {
		this.addrs=adr;
	}
	
	
	
	public void setId(int id) {
		this.id = id; 
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}
	
	

}
