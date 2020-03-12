package com.sysone.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sysone.model.Persona;
import com.sysone.repository.PersonaRepository;
import com.sysone.service.PersonaServices;

@Service
public class PersonaServicesImpl implements PersonaServices{
	
	@Autowired
	PersonaRepository personaRepo;
	
	@Override
	public List<Persona> getPersonAll() {
		return (List<Persona>) personaRepo.findAll();
	}

	@Override
	public Persona getPersonById(Long id) {
		return personaRepo.findById(id).get();
	}

	@Override
	public void saveOrUpdatePersona(Persona persona) {
		personaRepo.save(persona);
	}

	@Override
	public void deletePersona(Long id) {
		personaRepo.deleteById(id);
	}
	
}
