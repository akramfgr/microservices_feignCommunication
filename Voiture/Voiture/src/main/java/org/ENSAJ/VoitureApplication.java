package org.ENSAJ;
import org.ENSAJ.Model.Voiture;
import org.ENSAJ.Repository.VoitureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;

@EnableFeignClients
@SpringBootApplication
public class VoitureApplication {
	private VoitureRepository voitureRepository;

	public static void main(String[] args) {
		SpringApplication.run(VoitureApplication.class, args);
	}



    @Transactional
	@Bean
	CommandLineRunner initialiser(VoitureRepository voitureRepository){
		return args -> {

	        voitureRepository.save(new Voiture(Long.parseLong("1"),  "A 11111", "Kia", "Corolla", Long.parseLong("1")));
			voitureRepository.save(new Voiture(Long.parseLong("2"), "B 6 3456","Renault", "Megane", Long.parseLong("2")));
			voitureRepository.save(new Voiture(Long.parseLong("3"), "A 55 4444", "Mercedes", "301", Long.parseLong("3")));

		};
	}


}
