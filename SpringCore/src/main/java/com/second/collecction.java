package com.second;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class collecction {
	
	private String name ; 
	private List<String> ans;
	private Set<String> ans1;
	private Map<Integer,String> ans2;
	
	
	public Set<String> getAns1() {
		return ans1;
	}
	public void setAns1(Set<String> ans1) {
		this.ans1 = ans1;
	}
	public Map<Integer, String> getAns2() {
		return ans2;
	}
	public void setAns2(Map<Integer, String> ans2) {
		this.ans2 = ans2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAns() {
		return ans;
	}
	public void setAns(List<String> ans) {
		this.ans = ans;
	} 
	
	public String toString() {
	    return "collecction {\n" +
	           "  name = '" + name + "',\n" +
	           "  ans = " + ans + ",\n" +
	           "  ans1 = " + ans1 + ",\n" +
	           "  ans2 = " + ans2 + "\n" +
	           "}";
	}


}
