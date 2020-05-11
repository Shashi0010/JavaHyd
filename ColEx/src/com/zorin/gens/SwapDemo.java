package com.zorin.gens;

class Data<T> {
	public void swap(T a, T b) {
		T t;
		t=a;
		a=b;
		b=t;
		System.out.println("A value " +a+ " B value " +b);
	}
}
public class SwapDemo {
	public static void main(String[] args) {
		Data obj = new Data();
		int a,b;
		a=5;
		b=7;
		obj.swap(a, b);
		String s1="Karthik", s2="Hitesh";
		obj.swap(s1, s2);
		double a1=12.5, b1=6.3;
		obj.swap(a1, b1);
	}
}
