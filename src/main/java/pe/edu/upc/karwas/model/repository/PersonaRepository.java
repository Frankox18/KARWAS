package pe.edu.upc.karwas.model.repository;

import java.util.List;


import pe.edu.upc.karwas.model.entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {
List<Persona>findByApellido(String apellido) throws Exception;
List<Persona>findByDni(Integer dni) throws Exception;
}
