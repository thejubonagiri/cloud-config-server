package com.springconfigserver.sprngconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SprngConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprngConfigServerApplication.class, args);
	}

}
