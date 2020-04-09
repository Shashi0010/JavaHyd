package com.zorin.day4;

public class StrDemo {
	public static void main(String[] args) {
		String s1="Dinesh",s2="Answesh",
				s3="Karthik",s4="Dinesh";
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		String s5=new String("Dinesh");
		System.out.println(s1==s5);
		System.out.println(s1.equals(s5));
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());
//		System.out.println(s4.hashCode());
	}
}
