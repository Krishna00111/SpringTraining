package com.wipro.Movie;

public class BDCEmployee extends EmpInterface {
	
	private String name; 
	
	@Override
	public void display() {
		System.out.println("BDC employee: ", name);
		
	}

}


