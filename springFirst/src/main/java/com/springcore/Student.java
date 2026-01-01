package com.springcore;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAdd;
	
	public Student(int studentId, String studentName, String studentAdd) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAdd = studentAdd;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAdd=" + studentAdd + "]";
	}
	
	
	
	public int getStudentId() {
		System.out.println("getting id");
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		System.out.println("getting name");

		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAdd() {
		System.out.println("getting Add");

		return studentAdd;
	}
	public void setStudentAdd(String studentAdd) {
		this.studentAdd = studentAdd;
	}
	

}
