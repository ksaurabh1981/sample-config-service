package ks.sample.config.service.classpath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServiceClasspathApp {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceClasspathApp.class, args);
	}
}
