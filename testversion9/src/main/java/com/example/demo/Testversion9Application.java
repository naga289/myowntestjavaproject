package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages= {"com.example.entity","com.example.controller"})
@SpringBootApplication

@ComponentScan(basePackages= {"com.example"})
public class Testversion9Application {

	public static void main(String[] args) {
		SpringApplication.run(Testversion9Application.class, args);
	}

}
