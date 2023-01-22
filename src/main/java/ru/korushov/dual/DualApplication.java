package ru.korushov.dual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("ru.korushov.dual")
@ComponentScan("ru.korushov.dual")
public class DualApplication {

	public static void main(String[] args) {
		SpringApplication.run(DualApplication.class, args);
	}

}
