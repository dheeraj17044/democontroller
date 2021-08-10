package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Demo Rest API", version = "1.0", description = "demo"))
public class DemorestcontrollerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemorestcontrollerApplication.class, args);
	}

}
