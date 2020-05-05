package com.zorin.ex;

public class Quiz9 {
	public static void main(String[] args) {
		int[] a = new int[] {12,5};
		try {
			a[10]=5/0;
		} catch(ArithmeticException e) {
			System.out.println("Division By Zero ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Size Small...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
