package com.wipro.SpringL2Assignment1;

import javax.persistence.Entity;
import javax.persistence.id;
import javax.persistence.Table;

@Entity
@Table(name="StudentDetail")
public class Student {
	
	
	
	@Id
	private int id; 
	
	private String name;
	
	public Student() {

}
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Student{" + "id-" + id+", name=""+ name+'\''+'}';
			
	 }
	}
