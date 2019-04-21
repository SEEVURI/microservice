package com.srini.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.srini.controller"})
public class SpringBootClient {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootClient.class, args);
	}
}



