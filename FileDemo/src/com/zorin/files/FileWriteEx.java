package com.zorin.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {
	public static void main(String[] args) {
		File src=new File("C:/Java_Zorin/Day2_2/BoxDemo/src/com/zorin/day4/Quiz1.java");
		File tar=new File("e:/Java/Cpy.java");
		
		FileReader fr=null;
		FileWriter fw=null;
		
		try {
			fr=new FileReader(src);
			fw=new FileWriter(tar);
			
			int ch;
			while((ch=fr.read()) != -1) {
				fw.write((char)ch);
			}
			fr.close();
			fw.close();
			System.out.println("File Copied Successfully...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
