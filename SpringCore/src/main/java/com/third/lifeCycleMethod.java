package com.third;

public class lifeCycleMethod {
	
	int x ;
	int y;
	
	public void init() {
        System.out.println("init method called");
    }
	
	public void destroy() {
		System.out.println("destroy method called");
	}

	@Override
	public String toString() {
		return "lifeCycleMethod [x=" + x + ", y=" + y + "]";
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
