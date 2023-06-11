package com.customer.rewards.calculations.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomizedResponseHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleCustomException(Exception ex, WebRequest request) throws Exception {
		CustomizedExceptionDetails custmExcep = new CustomizedExceptionDetails(LocalDateTime.now(), ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<>(custmExcep, HttpStatus.INTERNAL_SERVER_ERROR);

	}
	
	@ExceptionHandler(CustomerNotFoundException.class)
	public final ResponseEntity<Object> handleCustomNotFoundException(Exception ex, WebRequest request) throws Exception {
		CustomizedExceptionDetails custmExcep = new CustomizedExceptionDetails(LocalDateTime.now(), ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<>(custmExcep, HttpStatus.NOT_FOUND);

	}
}
