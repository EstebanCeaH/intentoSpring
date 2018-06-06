package com.people.pruebaingreso.services;

import com.people.pruebaingreso.domain.Persona;
import com.people.pruebaingreso.repositories.PersonaRepository;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Null;
import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaServiceImpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Override
    public Persona findPersonaById(int id) {
        return personaRepository.findById(id).get();
    }

    @Override
    public List<Persona> findAllPersona() {
        return personaRepository.findAll();
    }

    @Override
    public Persona savePersona(Persona persona) {
        return personaRepository.save(persona);
    }


}
