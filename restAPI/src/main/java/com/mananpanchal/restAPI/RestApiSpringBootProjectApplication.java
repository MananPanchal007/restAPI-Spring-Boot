package com.mananpanchal.restAPI;

import com.mananpanchal.restAPI.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiSpringBootProjectApplication {

	@Autowired
	StudentRepo studentRepo;

	public static void main(String[] args) {
		SpringApplication.run(RestApiSpringBootProjectApplication.class, args);
	}

}
