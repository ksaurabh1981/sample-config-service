package ks.sample.config.service.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServiceFileApp {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceFileApp.class, args);
	}
}
