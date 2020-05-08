package pe.edu.upc.karwas.business;

import java.util.Optional;

import pe.edu.upc.karwas.model.entity.Empresa;


public interface EmpresaBusiness extends CrudBusiness<Empresa, Integer>{
	Optional<Empresa> readByNombre(String nombre) throws Exception;
}
