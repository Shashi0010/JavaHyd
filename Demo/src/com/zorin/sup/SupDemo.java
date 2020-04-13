package com.zorin.sup;

class First {
	public void show() {
		System.out.println("Show from class First...");
	}
}

class Second extends First {
	public void show() {
		super.show();
		System.out.println("Show from Class Second...");
	}
}

public class SupDemo {
	public static void main(String[] args) {
		Second obj=new Second();
		obj.show();
	}
}
