package br.com.josegomes.firstprojectspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // Notação para dizer que aqui roda aplicação
@ComponentScan(basePackages = "br.com.josegomes") // Verifica Arquivos fora do pacote principal passando essa variavel mais o nome do arquivo
public class FirstProjectSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectSpringApplication.class, args);

	}
}
