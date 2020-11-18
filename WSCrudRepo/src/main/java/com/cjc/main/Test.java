package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages="com")
@EntityScan(basePackages="com.cjc.model")
@EnableMongoRepositories(basePackages="com.cjc.dao")

public class Test {

	public static void main(String[] args) {
		
		System.out.println("hello");
		SpringApplication.run(Test.class, args);

	} 

}
