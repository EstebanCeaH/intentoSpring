package com.people.pruebaingreso.services;

import com.people.pruebaingreso.domain.Persona;

import java.util.List;

public interface PersonaService {

    Persona findPersonaById(int id);

    List<Persona> findAllPersona();

    Persona savePersona(Persona persona);

}
