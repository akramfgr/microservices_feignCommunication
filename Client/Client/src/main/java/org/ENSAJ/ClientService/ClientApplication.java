package org.ENSAJ.ClientService;

import org.ENSAJ.ClientService.Model.Client;
import org.ENSAJ.ClientService.Repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients("org.ENSAJ")
@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@Bean
	CommandLineRunner initialiser(ClientRepository clientRepository){
		return args -> {
			clientRepository.save(new Client(Long.parseLong("1"), "Akram", Float.parseFloat("20")));
			clientRepository.save(new Client(Long.parseLong("2"), "Soufiane", Float.parseFloat("24")));
			clientRepository.save(new Client(Long.parseLong("3"), "Rachid", Float.parseFloat("23")));
		};
	}

}
