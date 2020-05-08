package pe.edu.upc.karwas.business;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.karwas.model.entity.Auto;

public interface AutoBusiness extends CrudBusiness<Auto, Integer>{
	List<Auto> readByMarca(String marca) throws Exception;
	List<Auto> readByModelo( String modelo ) throws Exception;
}
