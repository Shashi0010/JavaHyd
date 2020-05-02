package com.zorin.test;

public class StEx {

	public void show() {
		System.out.println("From Show Method...");
	}
	
	public static void display() {
		System.out.println("From Display Method...");
	}
	
	public static void main(String[] args) {
		StEx obj=new StEx();
		obj.show();
		StEx.display();
	}
}
