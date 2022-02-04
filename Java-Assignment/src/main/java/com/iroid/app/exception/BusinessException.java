package com.iroid.app.exception;

/**
 * 
 * @author Jinesh Bhaskaran
 *
 */

public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BusinessException() {
	
	}

	public BusinessException(String msg) {
		super(msg);
	}
}
