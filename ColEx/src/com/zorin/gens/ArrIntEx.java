package com.zorin.gens;

import java.util.ArrayList;
import java.util.List;

public class ArrIntEx {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(new Integer(53));
		nums.add(new Integer(11));
		nums.add(new Integer(7));
		nums.add(new Integer(17));
		nums.add(new Integer(52));
//		nums.add("Welcome")
		int sum=0;
		for (Integer i : nums) {
			sum +=i;
		}
		System.out.println("Sum is  " +sum);
	}
}
