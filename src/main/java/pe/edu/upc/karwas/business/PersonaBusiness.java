package pe.edu.upc.karwas.business;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.karwas.model.entity.Persona;

public interface PersonaBusiness extends CrudBusiness<Persona, Integer> {
	Optional<Persona> readByDni(String dni) throws Exception;

	List<Persona> readByApellido(String apellido) throws Exception;
}
