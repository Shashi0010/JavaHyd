package com.zorin.day3;

public class Quiz4 {
	public static void main(String[] args) {
		byte b1 = 2;
        int i = 10; 
//         b1 = i + 5;
        b1 = (byte)(i + 5);
        System.out.println(b1); 
        b1 = (byte)(i + 256);
        System.out.println(b1);
       
        float f1 = 2.5F; 
         double d1 = 20.0; 
//         f1 = f1 + d1; 
	}
}
