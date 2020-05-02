package com.zorin.day3;

public class StrEx {

	public void strDemo() {
		String str="Welcome to Java Programming...Zorin";
		System.out.println("Length of String is  " +str.length());
		System.out.println("Lower Case  " +str.toLowerCase());
		System.out.println("Upper Case  " +str.toUpperCase());
		System.out.println("First Occurrence of given char 'a' " +str.indexOf("a"));
		System.out.println("Last Occurrence of given char 'a'  " +str.lastIndexOf("a"));
		System.out.println("First Occurrence of given char 'a' " +str.indexOf("x"));
		System.out.println("Char at 5th position  " +str.charAt(5));
		String s1 = "Dinesh", s2="Dinesh", s3="Srikanth", s4 = "Anand";
		System.out.println(s1.compareTo(s2)); // returns 0 as both strings are same 
		System.out.println(s1.compareTo(s3)); // returns -ve value as str1 < str3 
		System.out.println(s1.compareTo(s4)); // returns +ve value as str1 > str4 
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(str.replace("Java", "J2EE"));
	}
	public static void main(String[] args) {
		new StrEx().strDemo();
	}
}
