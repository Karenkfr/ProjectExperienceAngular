package com.karen.JavaAngular;

import com.karen.JavaAngular.model.entity.Cliente;
import com.karen.JavaAngular.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TreinamentoJavaAngularApplication {

	@Bean
	CommandLineRunner run(@Autowired ClienteRepository clienteRepository){
		return args -> {
			Cliente cliente = Cliente.builder().cpf("12345678912").nome("Fulano").build();
			clienteRepository.save(cliente);
		};
	}

	public static void main(String[] args) {
		SpringApplication.
						run(TreinamentoJavaAngularApplication.class, args);
	}
}
