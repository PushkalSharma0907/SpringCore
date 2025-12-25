package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee{
	
	Accountant accountant;
	
	@Autowired
	public void setAccountant(Accountant accountant) {
		this.accountant = accountant;
	}
	public void doWork() {
		System.out.println("Manage the branch office");
	}
	
	public void callMetting() {
		accountant.doWork();
	}
}
