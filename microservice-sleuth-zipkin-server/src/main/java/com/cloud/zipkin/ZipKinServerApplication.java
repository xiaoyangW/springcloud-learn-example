package com.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

/**
 * @author wxy
 */
@SpringBootApplication
@EnableZipkinServer
@EnableEurekaClient
public class ZipKinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipKinServerApplication.class, args);
	}
}
