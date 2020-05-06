package com.zorin.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadEx {

	public static void main(String[] args) {
		File src=new File("C:/Java_Zorin/Day2_2/BoxDemo/src/com/zorin/day4/Quiz1.java");
		try {
			FileReader fr=new FileReader(src);
			int ch;
			while((ch=fr.read()) != -1) {
				System.out.print((char)ch);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
