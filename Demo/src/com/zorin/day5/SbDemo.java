package com.zorin.day5;

public class SbDemo {
	public void show() {
		StringBuilder sb=new StringBuilder("Welcome to Java Programming");
		System.out.println(sb);
		sb.append(" Trainer Prasanna");
		System.out.println(sb);
		sb.delete(3, 10);
		System.out.println(sb);
		sb.insert(5, "Day5");
		System.out.println(sb);
	}
	public static void main(String[] args) {
		new SbDemo().show();
	}
}
