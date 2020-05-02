package com.zorin.test;

public class Cricket {

	static int score;
	
	public void incr(int x) {
		score = score+x;
	}
	
	public static void main(String[] args) {
		Cricket fb=new Cricket();
		Cricket sb=new Cricket();
		Cricket ext=new Cricket();
		
		fb.incr(67);
		sb.incr(11);
		ext.incr(7);
		
		System.out.println("Total Score is  " +Cricket.score);
	}
}
