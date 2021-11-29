package com.application.exception;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.application.model.ApiMessageModel;


@RestControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(NumberFormatException.class)
	public ResponseEntity<ApiMessageModel> handleNumberFormatException(NumberFormatException exception) {
		List<String> msgs = Arrays.asList("Check the variables!!!");
		Date date = new Date();
		int statusCode = HttpStatus.INTERNAL_SERVER_ERROR.value();

		ApiMessageModel error = new ApiMessageModel(statusCode, msgs, date);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
	}
}
