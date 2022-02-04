package com.iroid.app.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.iroid.app.dto.Result;
import com.iroid.app.dto.SuccessResponse;
import com.iroid.app.dto.UserRequest;
import com.iroid.app.exception.BusinessException;
import com.iroid.app.service.TaskService;

/**
 * 
 * @author Jinesh Bhaskaran
 *
 */

@Service
public class TaskServiceImpl implements TaskService {

	private Logger log = LoggerFactory.getLogger(TaskServiceImpl.class);

	@Override
	public SuccessResponse getResult(UserRequest userRequest) {

		SuccessResponse response = new SuccessResponse();

		try {
			log.info("inside getResult() in TaskServiceImpl class");

			List<Integer> request = userRequest.getInput();

			int sum = arraySum(request);

			int average = arrayAverage(request.size(), sum);

			List<Integer> greterThanAverage = greterThanAverage(request, average);

			Result result = new Result(sum, average, greterThanAverage);

			response.setResults(result);
			
			response.setStatus("SUCCESS");
			
			log.info("inside getResult() end of method in TaskServiceImpl class");

		} catch (Exception e) {
			log.error("Error Found " + e.getMessage());
			throw new BusinessException(e.getMessage());
		}

		return response;
	}

	private int arraySum(List<Integer> request) {
		
		log.info("inside arraySum() in TaskServiceImpl class");
		
		int sum = request.stream()
		            .mapToInt(Integer::intValue)
		            .sum();
		
		log.info("inside arraySum() end of method in TaskServiceImpl class");
		
		return sum;
	}

	private int arrayAverage(int size, int sum) {
		return sum/size;
	}

	private List<Integer> greterThanAverage(List<Integer> request, int average) {
		
		log.info("inside greterThanAverage() in TaskServiceImpl class");
		
		List<Integer> greater = new ArrayList<Integer>();
		
		
		for(int i =0; i<request.size();i++) {
			if(request.get(i)>average) {
				greater.add(request.get(i));
			}
		}
		
		log.info("inside greterThanAverage()  end of the method in TaskServiceImpl class");
		
		return greater;
	}

}
