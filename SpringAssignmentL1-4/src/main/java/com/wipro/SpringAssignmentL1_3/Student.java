package com.wipro.SpringAssignmentL1_3;


public class Student {
	private String studentName, studentId;
	private Test studentTest;
	private Test studentTest1;

	

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public Test getStudentTest() {
		return studentTest;
	}

	public void setStudentTest(Test studentTest) {
		this.studentTest = studentTest;
	}
	
	public void display() {
		System.out.println("ID:" + this.getStudentId());
		System.out.println("Name:" + this.getStudentName());
		System.out.println("Test ID:" + this.getStudentTest().getTestId());
		System.out.println("Test Title:" + this.getStudentTest().getTestTitle());
		System.out.println("Test Marks:" + this.getStudentTest().getTestMarks());
		System.out.println();
	}
	
	public void display1() {
		System.out.println("ID:" + this.getStudentId());
		System.out.println("Name:" + this.getStudentName());
		System.out.println("Test ID:" + this.getStudentTest().getTestId());
		System.out.println("Test Title:" + this.getStudentTest().getTestTitle());
		System.out.println("Test Marks:" + this.getStudentTest().getTestMarks());
		System.out.println("Test ID:" + this.getStudentTest1().getTestId());
		System.out.println("Test Title:" + this.getStudentTest1().getTestTitle());
		System.out.println("Test Marks:" + this.getStudentTest1().getTestMarks());
		
		System.out.println();
	}

	public Test getStudentTest1() {
		return studentTest1;
	}

	public void setStudentTest1(Test studentTest1) {
		this.studentTest1 = studentTest1;
	}
}
