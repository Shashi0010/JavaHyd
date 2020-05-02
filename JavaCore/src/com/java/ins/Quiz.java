package com.java.ins;

interface IOne {
	default void name() {
		System.out.println("Name from Ione...");
	}
}

interface ITwo {
	default void name() {
		System.out.println("Name from Itwo...");
	}
}

interface IThree {
	default void name() {
		System.out.println("Name from IThree...");
	}
}

class Anand implements IOne,ITwo,IThree {

	@Override
	public void name() {
		IOne.super.name();
		ITwo.super.name();
		IThree.super.name();
	}
	
}

public class Quiz {
	public static void main(String[] args) {
		Anand obj=new Anand();
		obj.name();
	}
}
