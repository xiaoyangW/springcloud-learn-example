package com.cloud;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigClinetApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClinetApplication.class, args);
	}
}
