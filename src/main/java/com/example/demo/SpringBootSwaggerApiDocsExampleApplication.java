package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.annotations.SwaggerDefinition;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class SpringBootSwaggerApiDocsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSwaggerApiDocsExampleApplication.class, args);
	}
	
	

}
