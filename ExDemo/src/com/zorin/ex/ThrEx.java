package com.zorin.ex;

public class ThrEx {
	public void check(int n) {
		if (n < 0) {
			throw new ArithmeticException("Negative Nos Not Allowed...");
		} else if (n == 0) {
			throw new NumberFormatException("Zero is Invalid...");
		} else {
			System.out.println("N value is  " +n);
		}
	}
	public static void main(String[] args) {
		int n=0;
		ThrEx obj=new ThrEx();
		try {
			obj.check(n);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
