package com.third;



import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class viaInterface implements InitializingBean, DisposableBean {
	
	int x ;
	int y;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		        System.out.println("init method called");
		
	}
	
	@Override
	public void destroy() {
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
