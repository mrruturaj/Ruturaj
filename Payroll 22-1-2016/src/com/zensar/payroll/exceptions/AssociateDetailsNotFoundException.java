package com.zensar.payroll.exceptions;

@SuppressWarnings("serial")
public class AssociateDetailsNotFoundException extends Exception {

	public AssociateDetailsNotFoundException() {
		this("Sorry your details doesnt exist");
	}

	public AssociateDetailsNotFoundException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public AssociateDetailsNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public AssociateDetailsNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public AssociateDetailsNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
