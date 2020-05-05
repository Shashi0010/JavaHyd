package com.zorin.ex;

class VotingException extends Exception {
	public VotingException(String error) {
		super(error);
	}
}

public class VotingDemo {
	
	public void check(int age) throws VotingException {
		if (age < 18) {
			throw new VotingException("You are not elligible for voting...");
		} else {
			System.out.println("Age is  " +age);
		}
	}
	public static void main(String[] args) {
		int age=19;
		VotingDemo obj = new VotingDemo();
		try {
			obj.check(age);
		} catch (VotingException e) {
			e.printStackTrace();
		}
	}
}
