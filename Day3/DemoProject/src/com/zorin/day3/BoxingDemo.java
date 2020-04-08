package com.zorin.day3;

public class BoxingDemo {
	public static void main(String[] args) {
		int a=12;
		double b=12.5;
		String name="Prudhvi";
		
		/* Boxing Demo */ 
		Object ob1=a;
		Object ob2=b;
		Object ob3=name;
		
		/* Unboxing Demo */
		int a1=(Integer)ob1;
		double b1=(Double)ob2;
		String n1=(String)ob3;
		
		System.out.println("After unboxing  ");
		System.out.println("A1 value  " +a1);
		System.out.println("B1 value  " +b1);
		System.out.println("N1 value  " +n1);
	}
}
