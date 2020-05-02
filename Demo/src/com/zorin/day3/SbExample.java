package com.zorin.day3;

public class SbExample {
	public void sbTest() {
		StringBuilder sb = new StringBuilder("Welcome to Java");
		System.out.println(sb);
		sb.append("\n We are from Zorin");
		System.out.println("String after appending...");
		System.out.println(sb);
		sb.insert(5, "Dinesh");
		System.out.println("After Insert");
		System.out.println(sb);
		sb.replace(5, 5, "Ram");
		System.out.println("After Replace ");
		System.out.println(sb);
		sb.delete(5, 5);
		System.out.println("After Delete  ");
		System.out.println(sb);
	}
	public static void main(String[] args) {
		new SbExample().sbTest();
	}
}
