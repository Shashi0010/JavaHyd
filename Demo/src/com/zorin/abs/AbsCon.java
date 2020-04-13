package com.zorin.abs;

abstract class Employ {
	int empno;
	String name;
	double basic;
	public Employ(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
}

class Rama extends Employ {

	public Rama(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}
public class AbsCon {
	public static void main(String[] args) {
		Employ employ=new Rama(1, "Rama", 88422);
		System.out.println(employ);
	}
}
