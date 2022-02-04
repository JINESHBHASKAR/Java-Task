package com.iroid.app;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.iroid.app.dto.Result;
import com.iroid.app.dto.SuccessResponse;
import com.iroid.app.dto.UserRequest;
import com.iroid.app.service.TaskService;

@SpringBootTest
class JavaAssignmentApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private TaskService taskSevice;
	
	
	private static ObjectMapper objectMapper = new ObjectMapper();
	
	@Test
	void contextLoads() throws Exception {
		
		List<Integer> value = Arrays.asList(2,3,4,6,5);
		UserRequest request = new UserRequest();
		request.setInput(value);
		
		SuccessResponse response = new SuccessResponse();
		Result result = new Result(10, 5, Arrays.asList(5));
		response.setStatus("SUCCESS");
		response.setResults(result);		
		Mockito.when(taskSevice.getResult(ArgumentMatchers.any())).thenReturn(response);
		String json = objectMapper.writeValueAsString(request);
		mockMvc.perform(post("/").contentType(MediaType.APPLICATION_JSON).characterEncoding("utf-8")
				.content(json).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.status", Matchers.equalTo("SUCCESS")))
				.andExpect(jsonPath("$.result", Matchers.equalTo(result)));
		
	}

}
