package com.onlineexam.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com")
@ComponentScan("com")
public class OnlineexamApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineexamApplication.class, args);
		System.err.println("Project is Running.....");
	}

}
