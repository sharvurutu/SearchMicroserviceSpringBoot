package com.spring.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootSearchMicroServiceApplication {

	public static void main(String[] args) {		
		SpringApplication.run(SpringBootSearchMicroServiceApplication.class, args);
	}
}
