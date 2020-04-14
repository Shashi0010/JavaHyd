package com.zorin.exam;

public class Quiz1 {

	int empno;
	String name;
	double basic;
	public Quiz1(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	
	
	@Override
	public String toString() {
		return "Quiz1 [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}


	public static void main(String[] args) {
		Quiz1 obj = new Quiz1(1, "Anand", 55222);
		System.out.println(obj);
	}
	
}
