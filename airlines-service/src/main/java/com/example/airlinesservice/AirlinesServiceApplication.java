package com.example.airlinesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AirlinesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlinesServiceApplication.class, args);
	}

}
