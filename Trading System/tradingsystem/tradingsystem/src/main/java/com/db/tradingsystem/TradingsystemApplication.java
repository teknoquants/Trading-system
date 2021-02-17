package com.db.tradingsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TradingsystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(TradingsystemApplication.class, args);
	}

}
