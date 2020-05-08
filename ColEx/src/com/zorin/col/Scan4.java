package com.zorin.col;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("e:/java/demo.txt");
			fw.write("12 hi 4 hello 34 true false 12.5 33 67.66 dinesh false 44 56.23 sneha 23");
			fw.close();
			FileReader fr=new FileReader("e:/java/demo.txt");
			Scanner sc=new Scanner(fr);
			while(sc.hasNext()) {
				if(sc.hasNextInt()) {
					System.out.println(sc.nextInt());
				} else {
					sc.next();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
