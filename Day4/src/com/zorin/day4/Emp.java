package com.zorin.day4;

public class Emp {
	int empno;
	String name;
	double basic;
	
	public Emp() { }
	public Emp(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
}
