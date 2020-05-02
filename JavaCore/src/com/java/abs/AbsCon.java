package com.java.abs;

abstract class Training {
	abstract void name();
	abstract void email();
}

class Karthik extends Training {

	@Override
	void name() {
		System.out.println("Name is Karthik...");
	}

	@Override
	void email() {
		System.out.println("Email is Karthik@gmail.com");
	}
	
}

class Dinesh extends Training {

	@Override
	void name() {
		System.out.println("Name is Dinesh...");
	}

	@Override
	void email() {
		System.out.println("Email is dinesh@gmail.com");
	}
	
}
public class AbsCon {
	public static void main(String[] args) {
		Training[] arr = new Training[] {new Dinesh(), new Karthik()};
		for (Training t : arr) {
			t.name();
			t.email();
		}
	}
}
