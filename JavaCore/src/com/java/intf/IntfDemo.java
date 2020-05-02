package com.java.intf;

interface ITraining {
	void name();
	void email();
}

class Mallesh implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Mallesh...");
	}

	@Override
	public void email() {
		System.out.println("Email is Mallesh@gmail.com");
	}
}

class Dinesh implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Dinesh...");
	}

	@Override
	public void email() {
		System.out.println("Email is dinesh@gmail.com");
	}
	
}

public class IntfDemo {
	public static void main(String[] args) {
		ITraining[] arr=new ITraining[] {
			new Mallesh(),
			new Dinesh()
		};
		
		for (ITraining i : arr) {
			i.name();
			i.email();
		}
	}
}
