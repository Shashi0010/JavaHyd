package com.zorin.day4;

public class Quiz1 {
	public static void main(String[] args) {
		String s1="Amit";
		String s2="Amit";
		String s3=new String("Amit");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
	}
}
