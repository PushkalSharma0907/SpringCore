package com.third;

import javax.annotation.postConstruct;
import javax.annotation.preDestroy;

public class viaAnnotation {
	
	int x ;
	int y;
	
	@postConstruct
	public void init() {
		        System.out.println("init method called");
		
	}
	
	@preDestroy
	public void des() {
		System.out.println("destroy method called");
	}

	@Override
	public String toString() {
		return "viaInterface [x=" + x + ", y=" + y + "]";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	

}
