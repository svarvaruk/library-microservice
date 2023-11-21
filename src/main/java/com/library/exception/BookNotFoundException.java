package com.library.exception;

public class BookNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -6325490564007179666L;

	public BookNotFoundException(String id) {
		super("Cannot find book by the given id: " + id);		
	}
}
