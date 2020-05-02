package com.zorin.day3;

import java.util.Arrays;

public class ArrNames {

	public static void main(String[] args) {
		String[] names=new String[] {
				"Dinesh",
				"Niharika",
				"Hitesh",
				"Snehal",
				"Ramakrishna",
				"Surendher"
		};
		System.out.println("Names are  ");
		for (String s : names) {
			System.out.println(s);
		}
		
		Arrays.sort(names);
		System.out.println("Sorted Names are  ");
		for (String s : names) {
			System.out.println(s);
		}
	}
}
