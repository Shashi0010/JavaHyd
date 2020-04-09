package com.zorin.day4;

public class EnumDemo1 {

	public static void main(String[] args) {
		AccountType type=AccountType.SAVINGS;
		System.out.println(type);
		
		/* To convert string to enum */ 
		
		String atype="SAVINGS";
		AccountType dyn=AccountType.valueOf(atype);
		System.out.println(dyn);
		
	}
}
