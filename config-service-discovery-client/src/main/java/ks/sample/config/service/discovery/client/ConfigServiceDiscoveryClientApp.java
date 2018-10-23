package ks.sample.config.service.discovery.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigServiceDiscoveryClientApp {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceDiscoveryClientApp.class, args);
	}
}
