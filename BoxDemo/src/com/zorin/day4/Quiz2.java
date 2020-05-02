package com.zorin.day4;

public class Quiz2 {
	public static void main(String[] args) {
		Employ emp1 = new Employ();
		Employ emp2 = new Employ();
		
		emp1.empno=1;
		emp1.name="Prudhvi";
		emp1.basic=88244;
		
		emp2.empno=3;
		emp2.name="Praveen";
		emp2.basic=88244;
		
		System.out.println(emp1==emp2);
		System.out.println(emp1.equals(emp2));
	}
}
