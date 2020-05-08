package pe.edu.upc.karwas.business;

import java.util.List;


import pe.edu.upc.karwas.model.entity.Persona;

public interface PersonaBusiness extends CrudBusiness<Persona, Integer> {
	List<Persona>readByApellido(String apellido) throws Exception;
	List<Persona>readByDni(Integer dni) throws Exception;
}
