package com.pucp.lab020252;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Lab020252Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab020252Application.class, args);
        System.out.printf("Hola Mundo!");
        List<String> lista = List.of("Elemento1", "Elemento2", "Elemento3");
        for (String elemento : lista) {
            System.out.println("elemento:" + elemento);
        }
        System.out.println("API DISTITA");
	}
}
