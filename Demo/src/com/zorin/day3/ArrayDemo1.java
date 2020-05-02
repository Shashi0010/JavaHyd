package com.zorin.day3;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] a = new int[] {5,3,76,33,42};
//		for(int i=0; i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		for (int i : a) {
			System.out.println(i);
		}
		Arrays.sort(a);
		System.out.println("Sorted List ");
		for (int i : a) {
			System.out.println(i);
		}
	}
}
