package com.zorin.col;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortDemo {
	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		s.add("Hitesh");
		s.add("Dinesh");
		s.add("Prudhvi");
		s.add("Ramakrishna");
		s.add("Shashikanth");
		s.add("Divya");
		for (Object object : s) {
			System.out.println(object);
		}
	}
}
