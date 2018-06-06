package com.people.pruebaingreso.controllers;

import com.people.pruebaingreso.domain.Persona;
import com.people.pruebaingreso.services.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(PersonaController.BASE_URL)
public class PersonaController {

    public static final String BASE_URL = "/api/v1/personas";

    private PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping
    List<Persona> getAllPersona() {
        return personaService.findAllPersona();
    }

    @GetMapping("/{id}")
    public Persona getPersonaByID(@PathVariable int id) {
        return personaService.findPersonaById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Persona savePersona(@RequestBody Persona persona) {
        return personaService.savePersona(persona);
    }

}
