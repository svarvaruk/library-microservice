package com.library.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.library.exception.AuthorNotFoundException;
import org.springframework.http.HttpStatus;

@ControllerAdvice
public class AuthorNotFoundAdvice {
	
	@ResponseBody
	@ExceptionHandler(AuthorNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String authorNotFoundHandler(AuthorNotFoundException ex) {
		return ex.getMessage();
	}
}
