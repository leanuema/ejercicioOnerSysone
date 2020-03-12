package com.sysone.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sysone.model.Persona;
import com.sysone.service.PersonaServices;

@RestController
@RequestMapping(value = "persona")
public class PersonaResource {
	
	@Autowired
	PersonaServices personaImp;

	@GetMapping(value="searchall", produces = {"application/json"})
	private List<Persona> personasAll(){
		return personaImp.getPersonAll();
	}
	
	@GetMapping(value = "searchById/{id}", produces = {"application/json"})
	private Persona personaById(@PathVariable("id") Long id) {
		return personaImp.getPersonById(id);
	}
	
	@PostMapping(value="saveorupdate", produces = {"application/json"})
	private void savePersonas(@RequestBody Persona persona) {
		personaImp.saveOrUpdatePersona(persona);
	}
	
	@DeleteMapping(value="deleteinfo", produces = {"application/json"})
	private void deleteBD(@PathVariable("id") Long id) {
		personaImp.deletePersona(id);
	}
}
