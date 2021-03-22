package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
@EnableJms
@SpringBootApplication
public class JmsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsExampleApplication.class, args);
	}

}
