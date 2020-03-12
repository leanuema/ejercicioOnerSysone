package com.sysone.service;

import java.util.List;

import com.sysone.model.Persona;

public interface PersonaServices {
	
	public List<Persona> getPersonAll();
	
	public Persona getPersonById(Long id);
	
	public void saveOrUpdatePersona(Persona persona);
	
	public void deletePersona(Long id);
 
}
