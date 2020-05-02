package com.zorin.day4;

public class Employ {

	int empno;
	String name;
	double basic;
	
	@Override
	public boolean equals(Object obj) {
		Employ employ = (Employ)obj;
		if(employ.basic == basic) {
			return true;
		} else {
			return false;
		}
	}
}
