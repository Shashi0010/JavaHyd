package com.zorin.cons;

public class ConEmploy {

	public static void main(String[] args) {
		Employ emp1=new Employ();
		emp1.empno=1;
		emp1.name="Ramakrishna";
		emp1.basic=88244;
		
		Employ emp2=new Employ(3, "Zainab", 88234);
		System.out.println(emp1);
		System.out.println(emp2);
	}
}
