package com.zorin.files;

import java.io.File;

public class FileEx {

	public static void main(String[] args) {
		File obj=new File("C:/Java_Zorin/Day2_2/BoxDemo/src/com/zorin/cons/ConEmploy.java");
		System.out.println("File Name  " +obj.getName());
		System.out.println("Parent Directory  " +obj.getParent());
		System.out.println("Path   " +obj.getPath());
		
		File f2=new File("C:/Java_Zorin/Day2_2/BoxDemo/src/com/zorin/day4/");
		String[] flist=f2.list();
		System.out.println("Files List  ");
		for (String s : flist) {
			System.out.println(s);
		}
	}
}
