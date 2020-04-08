package com.zorin.day3;

public class BoxTest {
	public void show(Object ob) {
//		String type=ob.getClass().getName();
		String type=ob.getClass().getSimpleName();
		System.out.println(type);
		if(type.equals("Integer")) {
			System.out.println("Integer Casting...");
			int x=(Integer)ob;
		}
		if(type.equals("Double")) {
			System.out.println("Double Casting...");
		}
		if(type.equals("String")) {
			System.out.println("String Casting...");
		}
	}
	public static void main(String[] args) {
		int a=12;
		double b=12.5;
		String name="Dinesh";
		BoxTest obj = new BoxTest();
		obj.show(a);
		obj.show(b);
		obj.show(name);
	}
}
