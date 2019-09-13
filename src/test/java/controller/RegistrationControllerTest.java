package controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import spring.config.StudentApplicationConfig;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.options;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest(classes={StudentApplicationConfig.class})
@AutoConfigureMockMvc
public class RegistrationControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void register() {
	}

	@Test
	public void getAllStudents() throws Exception {
		this.mockMvc.perform(get("/registration/listStudent")).andDo(print()).andExpect(status().isOk());
	}

	@Test
	public void getAllStudents_CORS() throws Exception {
		this.mockMvc.perform(options("/listStudent")
				.header("Access-Control-Request-Method", "GET")
				.header("Origin", "http://www.someurl.com"));
	}

	@Test
	public void addStudents_CORS() throws Exception {
		this.mockMvc.perform(options("/addStudent")
				.header("Access-Control-Request-Method", "POST")
				.header("Origin", "http://www.someurl.com"));
	}
}
