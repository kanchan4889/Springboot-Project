package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com")
@EntityScan("com.cjc.model")
@EnableJpaRepositories("com.cjc.dao")
public class Test {

	public static void main(String[] args)
	{
		System.out.println("Hello Spring Boot...");
		SpringApplication.run(Test.class);
	}
}
