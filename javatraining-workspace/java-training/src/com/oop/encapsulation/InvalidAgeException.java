package com.oop.encapsulation;

public class InvalidAgeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidAgeException() {
		super("The age is invalid.");
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}

}
