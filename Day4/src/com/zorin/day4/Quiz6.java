package com.zorin.day4;

public class Quiz6 {
	public void show(Integer x) {
		System.out.println("Show w.r.t Integer " +x);
	}
	public void show(Object x) {
		System.out.println("Show w.r.t. Object " +x);
	}
	public static void main(String[] args) {
		Quiz6 obj=new Quiz6();
		obj.show(new Integer(45));
	}
}
