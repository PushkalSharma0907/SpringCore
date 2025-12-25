package com.example;

public class student {
	
	private int id;  
	private String name;  
	  
	public student() {System.out.println("def cons");}  
	  
	public student(int id) {this.id = id;}  
	  
	public student(String name) {  this.name = name;}  
	  
	public student(int id, String name) {  
	    this.id = id;  
	    this.name = name;  
	}  
	  
	void show(){  
	    System.out.println(id+" "+name);  
	}

}
