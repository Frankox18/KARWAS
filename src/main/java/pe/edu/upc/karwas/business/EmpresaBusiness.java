package pe.edu.upc.karwas.business;

import java.util.List;


import pe.edu.upc.karwas.model.entity.Empresa;


public interface EmpresaBusiness extends CrudBusiness<Empresa, Integer>{
	List<Empresa> readByRuc(String ruc) throws Exception;
	List<Empresa> readByNombre(String nombre) throws Exception;
}
