package com.zorin.col;

import java.util.ArrayList;
import java.util.List;

public class ArrIntEx {
	public static void main(String[] args) {
		List nums=new ArrayList();
		nums.add(new Integer(18));
		nums.add(new Integer(9));
		nums.add(new Integer(11));
		nums.add(new Integer(27));
		nums.add(new Integer(19));
		int sum=0;
		for(Object ob : nums) {
			sum+=(Integer)ob;
		}
		System.out.println("Sum is   " +sum);
	}
}
