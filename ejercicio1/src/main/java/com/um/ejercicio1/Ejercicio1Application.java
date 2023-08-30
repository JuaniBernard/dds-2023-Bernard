package com.um.ejercicio1;

import com.um.ejercicio1.entidades.Persona;
import com.um.ejercicio1.repositorios.PersonaRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ejercicio1Application {
	@Autowired
	PersonaRepository personaRepository;

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio1Application.class, args);
	}

	@Bean
	CommandLineRunner init(PersonaRepository personaRepo) {
		return args -> {
			System.out.println("-----------------ESTOY FUNCIONANDO---------");
			Persona persona = new Persona();
			persona.setNombre("Juan");
			persona.setApellido("Pérez");
			persona.setEdad(30);

			// Guardar el objeto Persona en la base de datos
			// PersonaRepository personaRepository = context.getBean(PersonaRepository.class);
			personaRepository.save(persona);

			// Recuperar el objeto Persona desde la base de datos
			Persona personaRecuperada = personaRepository.findById(persona.getId()).orElse(null);
			if (personaRecuperada != null) {
				System.out.println("Nombre: " + personaRecuperada.getNombre());
				System.out.println("Apellido: " + personaRecuperada.getApellido());
				System.out.println("Edad: " + personaRecuperada.getEdad());
			}
		};
	}
}
