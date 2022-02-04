package com.iroid.app.dto;

import java.io.Serializable;
import java.util.List;

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
public class UserRequest implements Serializable {

	private static final long serialVersionUID = -8493203728516722998L;

	private List<Integer> input;

	public UserRequest() {

	}

	public UserRequest(List<Integer> input) {
		super();
		this.input = input;
	}

	public List<Integer> getInput() {
		return input;
	}

	public void setInput(List<Integer> input) {
		this.input = input;
	}

}
