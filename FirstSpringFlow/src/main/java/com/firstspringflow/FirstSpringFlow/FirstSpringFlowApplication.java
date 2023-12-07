package com.firstspringflow.FirstSpringFlow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// anotação para configurar o projeto pra que ele seja uma aplicação do spring boot
// anotation faz um processamento por baixo dos panos na hora de compilar o código fonte 
@SpringBootApplication
public class FirstSpringFlowApplication {

	public static void main(String[] args) {
		// comando para rodar a aplicação spring boot
		SpringApplication.run(FirstSpringFlowApplication.class, args);
	}
}
