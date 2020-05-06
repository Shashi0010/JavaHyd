package com.zorin.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		try {
			FileInputStream src=new FileInputStream("E:/Java/Cpy.java");
			FileOutputStream tar=new FileOutputStream("E:/Java/Demo.java");
			int ch;
			while((ch=src.read()) != -1) {
				tar.write((char)ch);
			}
			System.out.println("File Copied Successfully...");
			src.close();
			tar.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
