package com.zorin.col;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortStudent {

	public static void main(String[] args) {
		SortedSet studentList = new TreeSet();
		studentList.add(new Student(1, "Dinesh", "Chennai", 8.5));
		studentList.add(new Student(2, "Sambasiva", "Hyderabad", 7.9));
		studentList.add(new Student(3, "Hitesh", "Kurnool", 7.4));
		studentList.add(new Student(4, "Snehal", "Kakinada", 8.1));
		studentList.add(new Student(5, "Lingaraj", "Kadapa", 8.0));
		for (Object ob : studentList) {
			Student s = (Student)ob;
			System.out.println(s);
		}
	}
}
