package com.zorin.day4;

public class ConDemo {
	static {
		System.out.println("Static Constructor...");
	}
	public ConDemo() {
		System.out.println("Instance Constructor...");
	}
	public static void main(String[] args) {
		new ConDemo();
	}
}
