package com.yamy.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yamy.app.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {

}
