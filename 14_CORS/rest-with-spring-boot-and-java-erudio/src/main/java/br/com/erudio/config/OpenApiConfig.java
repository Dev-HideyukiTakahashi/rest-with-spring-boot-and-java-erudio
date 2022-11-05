package br.com.erudio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {
	
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("RESTful API with Java 17 and Spring Boot 3")
						.version("v1")
						.description("REST API's RESTFul do 0 à AWS c. Spring Boot 3 Java e Docker")
						.termsOfService("https://github.com/Dev-HideyukiTakahashi/rest-with-spring-boot-and-java-erudio")
						.license(new License()
								.name("Apache 2.0")
								.url("https://github.com/Dev-HideyukiTakahashi/rest-with-spring-boot-and-java-erudio")));
	}
	
}
