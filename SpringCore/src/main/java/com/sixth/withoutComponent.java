package com.sixth;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class withoutComponent {
	
	int a;
	
	private withoutXml obj;
	
	public withoutComponent(int a, withoutXml obj) {
		super();
		this.a = a;
		this.obj = obj;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	
	public void display() {
		System.out.println("This is without XML and without component configuration");
		System.out.println(a);
		System.out.println(obj);
	}

}
