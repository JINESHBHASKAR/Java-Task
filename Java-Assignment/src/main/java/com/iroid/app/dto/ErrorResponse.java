package com.iroid.app.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Jinesh Bhaskaran
 *
 */

/*
@Data
@AllArgsConstructor
@NoArgsConstructor
*/
public class ErrorResponse implements Serializable{
	
	private static final long serialVersionUID = 4752711784322162544L;

	private String status;
	
	private String message;
	
	
	public ErrorResponse() {
		
	}
	

	public ErrorResponse(String status, String message) {
		super();
		this.status = status;
		this.message = message;
	}




	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
