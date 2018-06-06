package com.people.pruebaingreso.bootstrap;

import com.people.pruebaingreso.domain.Persona;
import com.people.pruebaingreso.repositories.PersonaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final PersonaRepository personaRepository;

    public BootstrapData(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Cargando datos");

        Persona p1 = new Persona();
        p1.setNombre("Esteban");
        p1.setApellido("Cea");
        personaRepository.save(p1);

        Persona p2 = new Persona();
        p2.setNombre("Valentina");
        p2.setApellido("Miranda");
        personaRepository.save(p2);

        Persona p3 = new Persona();
        p3.setNombre("Martina");
        p3.setApellido("Cea");
        personaRepository.save(p3);

        System.out.println("Personas cargadas: "+personaRepository.count());


    }
}
