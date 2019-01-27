package com.dzl.backservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BackServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackServiceApplication.class, args);
	}

}

