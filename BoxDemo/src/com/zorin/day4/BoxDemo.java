package com.zorin.day4;

public class BoxDemo {

	public static void main(String[] args) {
		int a=12;
		double b=12.5;
		String name="Hitesh";
		
		/* Boxing Demo */
		
		Object ob1=a;
		Object ob2=b;
		Object ob3=name;
		
		/* Unboxing Demo */ 
		
		int a1=(Integer)ob1;
		double b1=(Double)ob2;
		String s=(String)name;
		
		System.out.println("A value " +a);
		System.out.println("B value  " +b1);
		System.out.println("Name is  " +name);
	}
}
