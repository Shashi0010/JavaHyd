package com.zorin.col;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add("Dinesh");
		s.add("Ramakrishna");
		s.add("Snehal");
		s.add("Mallesh");
		s.add("Dinesh");
		s.add("Ramakrishna");
		s.add("Snehal");
		s.add("Dinesh");
		s.add("Ramakrishna");
		s.add("Snehal");
		s.add("Dinesh");
		s.add("Ramakrishna");
		s.add("Snehal");
		s.add("Snehal");
		s.add("Mallesh");
		s.add("Dinesh");
		s.add("Snehal");
		s.add("Mallesh");
		s.add("Dinesh");
		s.add("Snehal");
		s.add("Mallesh");
		s.add("Dinesh");
		System.out.println("Names are  ");
		for (Object object : s) {
			System.out.println(object);
		}
	}
}
