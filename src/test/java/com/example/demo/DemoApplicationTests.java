package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Value("${demo.secret}")
    private String demoSecret;

	@Test
	void contextLoads() {
		// assertEquals(1, 2);
		System.out.println("Demo Secret in Test: " + demoSecret);
	}

}
