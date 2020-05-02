package com.zorin.day4;

public class Demo3 {

	public int sum() {
		return 5;
	}
	
	public int sum(int x) {
		return x+5;
	}
	
	public int sum(int x,int y) {
		return x+y;
	}
	public static void main(String[] args) {
		int res;
		Demo3 obj=new Demo3(); 
		res=obj.sum();
		System.out.println("Result is  " +res);
		res=obj.sum(66);
		System.out.println("Result is  " +res);
		res=obj.sum(55, 14);
		System.out.println("Result is  " +res);
	}
}
