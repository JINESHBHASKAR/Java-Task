package com.iroid.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iroid.app.dto.SuccessResponse;
import com.iroid.app.dto.UserRequest;
import com.iroid.app.service.TaskService;

/**
 * 
 * @author Jinesh Bhaskaran
 *
 */

@RestController
@RequestMapping("/api")
public class TaskController {
	
	private Logger log = LoggerFactory.getLogger(TaskController.class);
	
	@Autowired
	private TaskService taskService;
	
	@PostMapping("/numberoperations")
	public ResponseEntity<SuccessResponse> numberOperations(@RequestBody UserRequest userRequest){
		
		log.info("inside numberOperations() in TaskController class");
		
		SuccessResponse response = taskService.getResult(userRequest);
		
		return ResponseEntity.ok().body(response);
		
	}

}
