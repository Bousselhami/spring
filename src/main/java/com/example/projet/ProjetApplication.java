package com.example.projet;

import com.example.projet.entities.Livre;
import com.example.projet.repo.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class ProjetApplication implements CommandLineRunner {

	@Autowired
	private LivreRepository livreRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//livreRepository.save(new Livre(null, "Livre1", "Maison1", new Date(), "Acteur1", 40L, "ISBN", new Date(), true));
		//livreRepository.save(new Livre(null, "Livre2", "Maison2", new Date(), "Acteur2", 330L, "ISBN2", new Date(), false));
		//livreRepository.save(new Livre(null, "Livre3", "Maison3", new Date(), "Acteur3", 122L, "ISBN3", new Date(), true));
	}
}
