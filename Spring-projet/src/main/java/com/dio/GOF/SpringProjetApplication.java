package com.dio.GOF;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Projeto Spring Boot Gerado via Spring Initializr
 *
 * Os seguintes modulos foram selecionado:**
 **
 *  -Spring Data JPA
 *  -Spring Web
 *  -H2 Data Base
 *  -OpenFeign
 * @author cibersky-code
 */
@EnableFeignClients
@SpringBootApplication
public class SpringProjetApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjetApplication.class, args);
	}

}
