package com.fifth;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("compo")
public class My_component {
	
	@Value("RAJA RAM")
	private String name;
	
	@Value("108")
	private int num;
	
	@Value("#{namesList}")
	private List<String> song;
	
	@Value("#{T(Math).sqrt(25)}")
	private double math;
	
	@Value("#{T(Math).E}")
	private double a;
	
	@Value("#{new String('JAI BAJRANG BALI')}")
	private String nara;
	
	@Value("#{8>3}")
	private boolean istrue ;

	@Override
	public String toString() {
		return "My_component [name=" + name + ", num=" + num + ", song=" + song + ", math=" + math + ", a=" + a
				+ ", nara=" + nara + ", istrue=" + istrue + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
