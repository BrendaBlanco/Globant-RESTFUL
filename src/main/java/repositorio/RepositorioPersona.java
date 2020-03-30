package repositorio;


import org.springframework.data.jpa.repository.JpaRepository;

import entidad.Persona;

import java.sql.Date;

public interface RepositorioPersona extends JpaRepository<Persona, Integer>{
   
	Persona findById(int id);
	Persona findByDni(int dni);
	Persona findByNombre(String nombre);
	Persona findByApellido(String apellido);
	Persona findByEdad(int edad);
	Persona findByFechaNacimiento(Date fechaNacimiento);

}
