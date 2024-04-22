package com.whisper.cooperdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CooperDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CooperDiscoveryApplication.class, args);
	}

}
