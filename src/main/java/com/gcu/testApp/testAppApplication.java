package com.gcu.testApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.gcu"})
@SpringBootApplication
public class testAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(testAppApplication.class, args);	
	}
}
