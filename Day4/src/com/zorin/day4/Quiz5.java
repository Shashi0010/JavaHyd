package com.zorin.day4;

public class Quiz5 {
	public void show(int x) {
		System.out.println("Show w.r.t int " +x);
	}
	public void show(Object x) {
		System.out.println("Show w.r.t. Object " +x);
	}
	public static void main(String[] args) {
		Quiz5 obj=new Quiz5();
		obj.show(new Integer(45));
	}
}
