package com.zorin.day3;

public class Loop1 {

	public void show(int n) {
		int i=0;
		while(i < n) {
			System.out.println("I value " +i);
			i++;
		}
	}
	public static void main(String[] args) {
		new Loop1().show(5);
	}
}
