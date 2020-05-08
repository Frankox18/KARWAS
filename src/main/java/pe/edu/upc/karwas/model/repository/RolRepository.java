package pe.edu.upc.karwas.model.repository;

import java.util.List;


import pe.edu.upc.karwas.model.entity.Rol;

public interface RolRepository extends JpaRepository<Rol, Integer>{
	List<Rol> findByNombreRol( String nombreRol ) throws Exception;
}
