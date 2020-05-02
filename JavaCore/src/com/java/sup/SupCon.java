package com.java.sup;

class Employ {
	
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

class Shashikanth extends Employ {

	public Shashikanth(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}

class Ramakrishna extends Employ {

	public Ramakrishna(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}

public class SupCon {
	public static void main(String[] args) {
		Employ emp1 = new Shashikanth(1, "Shashikanth", 63566);
		Employ emp2 = new Ramakrishna(3, "Ramakrishna", 88244);
		System.out.println(emp1);
		System.out.println(emp2);
	}
}
