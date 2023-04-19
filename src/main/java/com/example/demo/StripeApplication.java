package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan({"com.example.demo.servicio","com.example.demo.controlador","com.example.demo.repositorio"})
@EntityScan("com.example.demo.modelo")
public class StripeApplication {

	public static void main(String[] args) {
		SpringApplication.run(StripeApplication.class, args);
	}

}
