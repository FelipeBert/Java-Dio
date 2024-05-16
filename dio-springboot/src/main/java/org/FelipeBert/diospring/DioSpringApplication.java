package org.FelipeBert.diospring;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Documentação com Open Api", version = "1", description = "Utilizando Open Api para Documentar projeto da DIO"))
public class DioSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioSpringApplication.class, args);
	}
}