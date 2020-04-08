package com.zorin.day3;

public class Quiz8 {
	public static void main(String[] args) {
		int x=12;
		int y=x++ + ++x - x-- + --x + x++;
		System.out.println(y);
	}
}
