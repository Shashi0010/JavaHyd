package com.zorin.ex;

class NegativeException extends Exception {
	NegativeException(String error) {
		super(error);
	}
}

class NumberZeroException extends Exception {
	NumberZeroException(String error) {
		super(error);
	}
}

public class Custom {

	public void add(int a,int b) throws NegativeException, NumberZeroException {
		if (a < 0 || b < 0) {
			throw new NegativeException("Negative Nos Not Allowed...");
		} else if (a == 0 || b == 0) {
			throw new NumberZeroException("Zero is Invalid Value...");
		} else {
			int c=a+b;
			System.out.println("Sum is  " +c);
		}
	}
	
	public static void main(String[] args) {
		Custom obj=new Custom();
		try {
			obj.add(5, 3);
		} catch (NegativeException | NumberZeroException e) {
			e.printStackTrace();
		}
	}
}
