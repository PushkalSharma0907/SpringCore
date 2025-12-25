package com.sixth;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj")
public class withoutXml {
	
	@Value("10")
	int a;
	
	public void display() {
		System.out.println("This is without XML configuration");
		System.out.println(a);
	}

	

	@Override
	public String toString() {
		return "withoutXml [a=" + a + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
