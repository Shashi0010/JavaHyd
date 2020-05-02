package com.zorin.day4;

public class EmployDemo {

	int empno;
	String name;
	double basic;
	
	@Override
	public String toString() {
		return "EmployDemo [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}

	public static void main(String[] args) {
		EmployDemo obj = new EmployDemo();
		obj.empno=1;
		obj.name="Dinesh";
		obj.basic=88233;
		System.out.println(obj);
	}
}
