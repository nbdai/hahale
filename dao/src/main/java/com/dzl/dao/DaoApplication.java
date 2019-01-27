package com.dzl.dao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan(basePackages={"com.dzl.pojo"})
public class DaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaoApplication.class, args);
	}

}

