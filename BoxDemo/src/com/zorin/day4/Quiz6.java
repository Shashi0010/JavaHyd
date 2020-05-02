package com.zorin.day4;

public class Quiz6 {

	public void show(Integer x) {
		System.out.println("Show w.r.t int " +x);
	}
	
	public void show(Object x) {
		System.out.println("Show w.r.t. Object " +x);
	}
	
	public static void main(String[] args) {
		new Quiz6().show(new Integer(8));
	}
}
