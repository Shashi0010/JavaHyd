package com.zorin.col;

import java.util.ArrayList;
import java.util.List;

public class ArrEmploy {
	public static void main(String[] args) {
		List names=new ArrayList();
		names.add(new Employ(1, "Dinesh", 88234));
		names.add(new Employ(2, "Hitesh", 88113));
		names.add(new Employ(3, "Ramakrishna", 88234));
		names.add(new Employ(4, "Praveen", 88136));
		
		System.out.println("Employ List  ");
		for (Object ob : names) {
			Employ employ = (Employ)ob;
			System.out.println(employ);
		}
	}
}
