package com.itb.inf2gm.pizzariabomdemais;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzariabomdemaisApplication {

	public static void main(String[] args) {

        SpringApplication.run(PizzariabomdemaisApplication.class, args);

        System.out.println("Pizzaria Bom demais rodando na porta 8080");
	}

}
