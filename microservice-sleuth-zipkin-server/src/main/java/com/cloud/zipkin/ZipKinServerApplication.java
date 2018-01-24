package com.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wxy
 */
@SpringBootApplication
@EnableEurekaClient
public class ZipKinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipKinServerApplication.class, args);
	}
}
