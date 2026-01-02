package com.second;

public class ambiguity {
	
	int x;
	String y;
	
	
	public ambiguity(String x, String y) {
		System.out.println("Constructor with both parameters as String");
		
	}
	
	public ambiguity(int x, String y) {
		this.x = x;
		this.y = y;
	}
	
	public void display() {
		
		System.out.println("Value of x: " + x);
		System.out.println("Value of y: " + y);
	}
	
	
	

}
