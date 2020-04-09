package com.zorin.day4;

public class Quiz2 {
	public static void main(String[] args) {
		Employ e1=new Employ();
		e1.empno=1;
		e1.name="Karthik";
		e1.basic=82834;
		
		Employ e2=new Employ();
		e2.empno=3;
		e2.name="Venkat";
		e2.basic=82834;
		
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
	}
}
