package com.bala.restsvc.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.bala.restsvc.model"} )
@EnableJpaRepositories(basePackages = {"com.bala.restsvc.dao"})
public class RestsvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestsvcApplication.class, args);
	}

}
