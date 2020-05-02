package com.zorin.day4;

public class BoxEmploy {
	public void show(Object ob) {
		// int x=(Integer)ob;
		Employ e = (Employ)ob;
		System.out.println("Employ No " +e.empno); 
		System.out.println("Employ Name  " +e.name);
		System.out.println("Salary   " +e.basic);
	}
	public static void main(String[] args) {
		Employ employ=new Employ();
		employ.empno=1;
		employ.name="Prudhvi";
		employ.basic=88234;
		BoxEmploy obj = new BoxEmploy(); 
		obj.show(employ);
	}
}
