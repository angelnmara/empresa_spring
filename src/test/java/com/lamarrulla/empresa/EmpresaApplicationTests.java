package com.lamarrulla.empresa;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lamarrulla.empresa.entity.RoleCat;
import com.lamarrulla.empresa.repository.IRoleCatRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.Assert;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class EmpresaApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@Autowired
	private IRoleCatRepository iRoleCatRepository;

	@Test
	void contextLoads() throws Exception {
		RoleCat roleCat = new RoleCat();
		roleCat.setId(1L);
		roleCat.setName("Dave");
		mockMvc.perform(post("/private/role-cat")
						.contentType("application/json")
						.param("id", "1")
						.content(objectMapper.writeValueAsString(roleCat)))
				.andExpect(status().isOk());
		RoleCat roleCatEntity = iRoleCatRepository.findById(1).get();
		Assert.hasText(roleCatEntity.getName(), "Dave");
	}

}
