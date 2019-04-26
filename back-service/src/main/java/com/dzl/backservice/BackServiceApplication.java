package com.dzl.backservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories(basePackages ={"com.dzl.dao"})
@EntityScan(basePackages={"com.dzl.pojo"})
public class BackServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackServiceApplication.class, args);
	}

}

