package com.pace.springboot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { ErrorMvcAutoConfiguration.class })
@ComponentScan(basePackages = { "com.pace.springboot.retail.controller" })

public class SpringBootAppMain {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppMain.class, args);
		System.out.println("Spring Boot App Started..!");

	}
}
