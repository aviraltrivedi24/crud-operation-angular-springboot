package com.crud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.crud.domain.Entidy;
import com.crud.service.EntityService;

@SpringBootApplication
public class CrudAngularWithSpringBootApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CrudAngularWithSpringBootApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(EntityService entityService) {
		return args ->{
			entityService.save(new Entidy(1L, "Avi"));
			entityService.save(new Entidy(2L, "Anne"));
			entityService.save(new Entidy());
		};
	}
}