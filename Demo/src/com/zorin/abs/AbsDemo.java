package com.zorin.abs;

abstract class Training {
	abstract void name();
	abstract void email();
}

class Dinesh extends Training {
	@Override
	void name() {
		System.out.println("Name is Dinesh Kumar...");
	}
	@Override
	void email() {
		System.out.println("Email is dinesh@gmail.com");
	}
}

class Shashi extends Training {

	@Override
	void name() {
		System.out.println("Name is Shashi...");
	}

	@Override
	void email() {
		System.out.println("Email is shashi@gmail.com");
	}
	
}
public class AbsDemo {
	public static void main(String[] args) {
		Training[] arr=new Training[] {new Dinesh(),new Shashi()};
		for (Training training : arr) {
			training.name();
			training.email();
		}
	}
}
