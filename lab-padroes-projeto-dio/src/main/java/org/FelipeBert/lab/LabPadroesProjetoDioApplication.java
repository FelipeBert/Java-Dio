package org.FelipeBert.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoDioApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoDioApplication.class, args);
	}

}
