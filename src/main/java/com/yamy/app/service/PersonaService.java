package com.yamy.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yamy.app.model.Persona;
import com.yamy.app.repository.PersonaRepository;

@Service
public class PersonaService {
	
	@Autowired	
	private PersonaRepository personaRepository;
	
	//Crea las personas
	public Persona create (Persona persona) {
		return personaRepository.save(persona);
	}
	
	// Lista las personas, retorna los objetos de la base de datos
	public List<Persona> getAllPersonas(){
		return personaRepository.findAll();
	}
	
	// Elimina persona
	public void delete(Persona persona){
		personaRepository.delete(persona);
	}
	
	// Actualiza datos de la persona
	
	public Optional<Persona> findById (Integer id) {
		return personaRepository.findById(id);
	}
	

}
