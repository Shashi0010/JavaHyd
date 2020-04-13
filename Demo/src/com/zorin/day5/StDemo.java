package com.zorin.day5;

public class StDemo {
	static void display() {
		System.out.println("From Display method...");
	}
	void sayHello() {
		System.out.println("From Hello Method...");
	}
	public static void main(String[] args) {
		new StDemo().sayHello();
		StDemo.display();
	}
}
