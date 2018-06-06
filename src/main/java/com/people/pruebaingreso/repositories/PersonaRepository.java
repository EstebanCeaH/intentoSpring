package com.people.pruebaingreso.repositories;

import com.people.pruebaingreso.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {
}
