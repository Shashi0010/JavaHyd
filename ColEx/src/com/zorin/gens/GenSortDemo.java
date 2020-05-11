package com.zorin.gens;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class GenSortDemo {
	public static void main(String[] args) {
		Comparator<Employ> c = new NameComparator();
		SortedSet<Employ> s=new TreeSet<Employ>(c);
		s.add(new Employ(1, "Karthik", 88234));
		s.add(new Employ(2, "Dinesh", 81134));
		s.add(new Employ(3, "Shashikanth", 83234));
		s.add(new Employ(4, "Surendher", 88999));
		s.add(new Employ(5, "Hitesh", 81444));
		s.add(new Employ(6, "Snehal", 86332));
		s.add(new Employ(7, "Mallesh", 84424));
		
		for (Employ employ : s) {
			System.out.println(employ);
		}
	}
}
