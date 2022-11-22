package com.lucidiovacas.springboot.task01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Task01Application {

	@Bean
	public CommandLineRunner run() {
		return args -> {
			System.out.println("Hello World to JMP");
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(Task01Application.class, args);
	}

}
