package com.zorin.gens;

import java.util.ArrayList;
import java.util.List;

import com.zorin.gens.Employ;

public class GenEmploy {

	public static void main(String[] args) {
		List<Employ> names=new ArrayList<Employ>();
		names.add(new Employ(1, "Dinesh", 88234));
		names.add(new Employ(2, "Hitesh", 88113));
		names.add(new Employ(3, "Ramakrishna", 88234));
		names.add(new Employ(4, "Praveen", 88136));
		names.add(new Employ(5, "Snehal", 86236));
		
		System.out.println("Employ List  ");
		for (Employ employ : names) {
			System.out.println(employ);
		}
	}
}
