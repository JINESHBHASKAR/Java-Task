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
public class SuccessResponse implements Serializable{


	private static final long serialVersionUID = 5782527334927181892L;
	
	private String status;
	
	private Result results;


	public SuccessResponse() {
		
	}
	

	public SuccessResponse(String status, Result results) {
		super();
		this.status = status;
		this.results = results;
	}



	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Result getResults() {
		return results;
	}

	public void setResults(Result results) {
		this.results = results;
	}

}
