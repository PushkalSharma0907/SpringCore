package com.first;

public class Const {
	
	private int yoyo;
	private String str;
	private int yo;
	
	
	public Const(int yoyo, String str, int yo) {
		super();
		this.yoyo = yoyo;
		this.str = str;
		this.yo = yo;
		System.out.println("setting values");
	}
	
	public void show() {
		System.out.println(yoyo);
		System.out.println(str);
		System.out.println(yo);
	}
	
	
}
