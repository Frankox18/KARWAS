package pe.edu.upc.karwas.business;

import java.util.List;

import pe.edu.upc.karwas.model.entity.Sucursal;

public interface SucursalBusiness extends CrudBusiness<Sucursal, Integer> {
	List<Sucursal> readByDistrito(String distrito) throws Exception;
}
