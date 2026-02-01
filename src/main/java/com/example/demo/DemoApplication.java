package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public String demoBean() {
		// assertEquals("Demo Bean", "Demo Bean");
		// assertEquals("Demo Bean", "Demo Bean");
		System.out.println("Demo Secret: " + System.getProperty("demo.secret"));
		return "Demo Bean";
	}

}
