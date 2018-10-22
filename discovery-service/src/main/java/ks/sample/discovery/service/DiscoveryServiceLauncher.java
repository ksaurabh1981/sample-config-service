package ks.sample.discovery.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServiceLauncher {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServiceLauncher.class, args);
	}
}
