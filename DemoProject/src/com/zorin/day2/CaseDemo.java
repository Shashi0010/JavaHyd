package com.zorin.day2;

public class CaseDemo {

	public void show(int choice) {
		switch(choice) {
		case 1 :
			System.out.println("Hi I am Hitesh");
			break;
		case 2 :
			System.out.println("Hi I am Prudhvi...");
			break;
		case 3 :
			System.out.println("HI I am Karthik...");
			break;
		case 4 : 
			System.out.println("Hi I am Mallesh...");
			break;
		case 5 : 
			System.out.println("Hi I am Samatha...");
			break;
		default : 
			System.out.println("Invalid Choice...");
			break;
		}
	}
	public static void main(String[] args) {
		int choice=99;
		CaseDemo obj=new CaseDemo();
		obj.show(choice);
	}
}
