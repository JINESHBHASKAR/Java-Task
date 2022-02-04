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
public class Result implements Serializable {

	private static final long serialVersionUID = 1L;

	private int sum;

	private int average;

	private List<Integer> greaterThanAverage;



	public Result() {

	}


	
	
	public Result(int sum, int average, List<Integer> greaterThanAverage) {
		super();
		this.sum = sum;
		this.average = average;
		this.greaterThanAverage = greaterThanAverage;
	}




	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}




	public List<Integer> getGreaterThanAverage() {
		return greaterThanAverage;
	}




	public void setGreaterThanAverage(List<Integer> greaterThanAverage) {
		this.greaterThanAverage = greaterThanAverage;
	}

	

}
