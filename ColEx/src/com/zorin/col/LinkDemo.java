package com.zorin.col;

import java.util.LinkedList;

public class LinkDemo {
	public static void main(String[] args) {
		LinkedList names=new LinkedList();
		names.add("Dinesh");
		names.add("Mallesh");
		names.add("Praveen");
		names.add("Shashikanth");
		names.addFirst("Ramakrishna");
		names.addLast("Snehal");
		System.out.println("Names are  ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
