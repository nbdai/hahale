package com.dzl.protal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@EntityScan(basePackages={"com.dzl.pojo"})

public class ProtalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProtalApplication.class, args);
	}

}
