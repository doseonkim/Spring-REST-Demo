package com.dozo.jackson.json.demo.rest;

public class StudentNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1421338405178070543L;

	public StudentNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public StudentNotFoundException(String message) {
		super(message);
	}

	public StudentNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
