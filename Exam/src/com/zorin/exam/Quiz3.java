package com.zorin.exam;

public class Quiz3 {

	public void show(Object ob) {
		if(ob=="XYZ") {
			System.out.println("Hi");
		} else {
			System.out.println("Bye");
		}
	}
	public static void main(String[] args) {
		Quiz3 obj=new Quiz3();
		String s="XYZ";
		obj.show(s);
	}
}
