package com.zorin.day3;

public class Quiz6 {
	public void incr(int x) {
		++x;
	}
	public static void main(String[] args) {
		int x=12;
		new Quiz6().incr(x);
		System.out.println("X value is  " +x);
	}
}
