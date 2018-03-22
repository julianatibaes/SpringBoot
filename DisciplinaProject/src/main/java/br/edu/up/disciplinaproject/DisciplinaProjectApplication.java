package br.edu.up.disciplinaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Classe respons�vel pelas configura��es 
 * e inicializa��o do web service Spring Boot - 
 * que utiliza o Tomcat
 */
@SpringBootApplication
public class DisciplinaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisciplinaProjectApplication.class, args);

	}

}
