package com.iroid.app.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.iroid.app.dto.ErrorResponse;


/**
 * 
 * @author Jinesh Bhaskaran
 *
 */

@ResponseBody
@ControllerAdvice
public class CustomExceptionHandler {

	private Logger log = LoggerFactory.getLogger(CustomExceptionHandler.class);
	
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public @ResponseBody ErrorResponse handleCommonException(final Exception exception) {

		log.info("inside handleCommonException() CustomExceptionHandler  class");
		ErrorResponse error = new ErrorResponse();
		error.setMessage("Numeric input excpected, received invalid");
		error.setStatus("FAILED");
		return error;

	}
}
