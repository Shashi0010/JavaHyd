package com.zorin.day4;

public class Quiz4 {

	public void show(double x) {
		System.out.println("Double " +x);
	}
	public void show(Object x) {
		System.out.println("Object  " +x);
	}
	public static void main(String[] args) {
		Quiz4 obj=new Quiz4();
		obj.show(12);
	}
}
