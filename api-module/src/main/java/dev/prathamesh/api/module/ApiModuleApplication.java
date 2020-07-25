package dev.prathamesh.api.module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"dev.prathamesh"})
public class ApiModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiModuleApplication.class, args);
	}

}
