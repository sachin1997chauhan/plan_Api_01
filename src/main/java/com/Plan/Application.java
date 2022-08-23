package com.Plan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@ComponentScan(basePackages = "com.Plan.Controller")
@ComponentScan(basePackages = "com.Plan.Entity")
@ComponentScan(basePackages = "com.Plan.Repo")
@EnableAutoConfiguration
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
