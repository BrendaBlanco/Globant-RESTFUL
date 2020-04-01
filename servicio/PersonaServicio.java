package com.globant.ejemplo.servicio;

import java.sql.Date;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globant.ejemplo.entidad.Persona;
import com.globant.ejemplo.repositorio.RepositorioPersona;

import java.util.List;


@Service
public class PersonaServicio {

    //@Autowired	
	//private RepositorioPersona repositorio;
	
	private final RepositorioPersona repositorio;

    public PersonaServicio(RepositorioPersona repositorio) {
        this.repositorio = repositorio;
    }
    
    public Persona grabarPersona(Persona persona) {
    	return repositorio.save(persona);
    }
    
    public List<Persona> grabarPersonas(List<Persona> personas) {
    	return repositorio.saveAll(personas);
    }
    public List<Persona> getPersona() {
    	return repositorio.findAll();
    }
    
    public Persona getPersonaById(int id) {
    	return repositorio.findById(id).orElse(null);
    }
    public Persona getPersonaByDni(int dni) {
    	return repositorio.findByDni(dni);
    }
    public Persona getPersonaByNombre(String nombre) {
    	return repositorio.findByNombre(nombre);
    }
    public Persona getPersonaByApellido(String apellido) {
    	return repositorio.findByApellido(apellido);
    }
    public Persona getPersonaByEdad(int edad) {
    	return repositorio.findByEdad(edad);
    }
    public Persona getPersonaByFechaNacimiento(Date fechaNacimiento) {
    	return repositorio.findByFechaNacimiento(fechaNacimiento);
    }
    public String deletePersona(int id) {
    	repositorio.deleteById(id);
    	return "persona borrada " + id; 
    }
    
    public Persona updatePersona(Persona persona) {
        Persona existingPersona = repositorio.findById(persona.getId()).orElse(null);
        existingPersona.setDni(persona.getDni());
        existingPersona.setNombre(persona.getNombre());
        existingPersona.setApellido(persona.getApellido());
        existingPersona.setEdad(persona.getEdad());
        existingPersona.setFechaNacimiento(persona.getFechaNacimiento());
        return repositorio.save(existingPersona);
    }
}
