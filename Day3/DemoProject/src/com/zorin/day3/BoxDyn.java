package com.zorin.day3;

public class BoxDyn {
	public void show(Object ob) {
		if (ob instanceof Integer) {
			int x=(Integer)ob;
			System.out.println("Integer Casting..." +x);
		}
		if (ob instanceof Double) {
			double x=(Double)ob;
			System.out.println("Double Casting..." +x);
		}
		if (ob instanceof String) {
			String x=(String)ob;
			System.out.println("String Casting  " +x);
		}
	}
	public static void main(String[] args) {
		int a=12;
		double b=12.5;
		String name="Dinesh";
		BoxDyn obj = new BoxDyn();
		obj.show(a);
		obj.show(b);
		obj.show(name);
	}
}
