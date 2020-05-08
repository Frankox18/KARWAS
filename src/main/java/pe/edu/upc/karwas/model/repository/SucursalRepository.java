package pe.edu.upc.karwas.model.repository;

import java.util.List;

import pe.edu.upc.karwas.model.entity.Sucursal;

public interface SucursalRepository extends JpaRepository<Sucursal, Integer> {
	List<Sucursal> findByDistrito(String distrito) throws Exception;
	List<Sucursal> findByDireccion(String direccion) throws Exception;
}
