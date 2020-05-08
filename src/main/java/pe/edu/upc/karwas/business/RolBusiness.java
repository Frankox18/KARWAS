package pe.edu.upc.karwas.business;

import java.util.List;

import pe.edu.upc.karwas.model.entity.Rol;

public interface RolBusiness extends CrudBusiness<Rol, Integer>{
	List<Rol> readfindByNombreRol( String nombreRol ) throws Exception;
}
