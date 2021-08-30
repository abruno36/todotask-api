package com.bruno.todotask;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodotaskApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TodotaskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
