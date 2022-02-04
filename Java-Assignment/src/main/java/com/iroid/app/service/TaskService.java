package com.iroid.app.service;

import com.iroid.app.dto.SuccessResponse;
import com.iroid.app.dto.UserRequest;

/**
 * 
 * @author Jinesh Bhaskaran
 *
 */

public interface TaskService {
	
	public SuccessResponse getResult(UserRequest userRequest);

}
