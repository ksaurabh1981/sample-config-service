package ks.sample.config.service.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServiceGitApp {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceGitApp.class, args);
	}
}
