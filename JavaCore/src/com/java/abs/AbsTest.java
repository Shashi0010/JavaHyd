package com.java.abs;

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

class Niharika extends Employ {

	public Niharika(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}

class Praveen extends Employ {

	public Praveen(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}

public class AbsTest {
	public static void main(String[] args) {
		Employ[] arr = new Employ[] {
			new Niharika(1, "Niharika", 88234),
			new Praveen(3, "Praveen", 88112)
		};
		for (Employ employ : arr) {
			System.out.println(employ);
		}
	}
}
