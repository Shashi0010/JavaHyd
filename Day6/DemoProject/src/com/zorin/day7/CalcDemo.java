package com.zorin.day7;

public class CalcDemo {

	public void calc(int a, int b) throws NegativeException, NumberZeroException {
		
		if (a < 0 || b < 0) {
			throw new NegativeException("Negative Nos Not Allowed...");
		} 
		else if (a == 0 || b == 0) {
			throw new NumberZeroException("Zero is Invalid Value...");
		} else {
			int c= a + b;
			System.out.println("Sum Value  " +c);
		}
	}
	
	public static void main(String[] args) {
		int a=12;
		int b=5;
		CalcDemo obj = new CalcDemo();
		try {
			obj.calc(a, b);
		} catch (NegativeException | NumberZeroException e) {
			e.printStackTrace();
		}
	}
}
