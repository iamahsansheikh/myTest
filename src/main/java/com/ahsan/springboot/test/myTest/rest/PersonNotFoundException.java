package com.ahsan.springboot.test.myTest.rest;

public class PersonNotFoundException extends RuntimeException {

	public PersonNotFoundException() {
	}

	public PersonNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writeableStackTrace) {
		super(message, cause, enableSuppression, writeableStackTrace);
	}

	public PersonNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public PersonNotFoundException(String message) {
		super(message);
	}

	public PersonNotFoundException(Throwable cause) {
		super(cause);
	}

}
