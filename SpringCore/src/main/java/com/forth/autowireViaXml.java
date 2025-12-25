package com.forth;

import com.second.collecction;

public class autowireViaXml {
	
	private collecction col ;

	public collecction getCol() {
		return col;
	}

	public void setCol(collecction col) {
		this.col = col;
	}

	public autowireViaXml(collecction col) {
		super();
		this.col = col;
	}
	
	public String toString() {
		return "autowireViaXml {\n" + "  col = " + col + "\n" + "}";
	}

}
