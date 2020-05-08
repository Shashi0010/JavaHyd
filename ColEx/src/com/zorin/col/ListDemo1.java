package com.zorin.col;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Dinesh");
		names.add("Sneha");
		names.add("Hitesh");
		names.add("Mallesh");
		System.out.println("Names are  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.add(3, "Praveen");
		System.out.println("List after adding new Name");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.set(1, "Snehal");
		System.out.println("List after Editing...");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.remove("Hitesh");
		System.out.println("Name after removing Item  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
