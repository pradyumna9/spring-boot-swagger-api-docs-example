package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	@Bean
	public Docket getDocumentation() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors.basePackage("com.example.demo"))
				.paths(PathSelectors.ant("/api/*"))
				.build()
				.apiInfo(getApiInfo());
	}
	private ApiInfo getApiInfo() {
		return new ApiInfo("GAMING SERVICE",
				"THIS SERVICE WE CAN ADD GAMES AS WELL AS WE CAN GET THE GAMES BASED ON ID",
				"2.0", "http://localhost:9002/"
				, "PRADYUMNA KUMAR DAS", 
				"PKD1.0", "PKD/ver/2.1");
	}
}
