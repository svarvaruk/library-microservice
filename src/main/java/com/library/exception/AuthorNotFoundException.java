package com.library.exception;

public class AuthorNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = -5652787299813752584L;

	public AuthorNotFoundException(String id) {
		super("Cannot find author by the given id: " + id);		
	}
}
