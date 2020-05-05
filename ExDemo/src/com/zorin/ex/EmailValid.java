package com.zorin.ex;


class InvalidEmailException extends Exception {
	public InvalidEmailException(String error) {
		super(error);
	}
}

class InvalidUserException extends Exception {
	public InvalidUserException(String error) {
		super(error);
	}
}
public class EmailValid {
	
	public void check(String email) throws InvalidEmailException, InvalidUserException {
		if (email.indexOf("@")== -1) {
			throw new InvalidEmailException("Invalid Email...");
		} if (email.indexOf("@") > 12) {
			throw new InvalidUserException("Invalid User...");
		} else {
			System.out.println("Email is  " +email);
		}
	}
	public static void main(String[] args) {
		String email = "ramakrishna@gmail.com";
		EmailValid obj = new EmailValid();
		try {
			obj.check(email);
		} catch (InvalidEmailException | InvalidUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
