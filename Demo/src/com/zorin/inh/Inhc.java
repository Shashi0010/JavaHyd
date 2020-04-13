package com.zorin.inh;

class C1 {
	static {
		System.out.println("Base class Static Constructor...");
	}
	public C1() {
		System.out.println("Base Class Constructor...");
	}
}

class C2 extends C1 {
	static {
		System.out.println("Derived Class Static Constructor...");
	}
	public C2() {
		System.out.println("Derived Class Constructor...");
	}
}
public class Inhc {
	public static void main(String[] args) {
		new C2();
	}
}
