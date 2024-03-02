package com.ashokit.rest.test;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.ashokit.service.WelcomeService;

@WebMvcTest
public class WelcomeRestControllerTest {

	@MockBean
	private WelcomeService welcomeService;

	private MockMvc mockMvc;

	public void welcomeTest() throws Exception {
		// defining behaviour for mock object method

	}

}
