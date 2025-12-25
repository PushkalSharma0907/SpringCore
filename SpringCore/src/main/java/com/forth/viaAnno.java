package com.forth;

import com.second.collecction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Autowired
@Qualifier("ob1")
public class viaAnno {
	
	private collecction col ;

	public collecction getCol() {
		return col;
	}

	public void setCol(collecction col) {
		this.col = col;
	}

	public viaAnno(collecction col) {
		super();
		this.col = col;
	}
	
	public String toString() {
		return "autowireViaXml {\n" + "  col = " + col + "\n" + "}";
	}

	
}
