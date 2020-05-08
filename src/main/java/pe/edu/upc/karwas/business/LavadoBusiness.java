package pe.edu.upc.karwas.business;

import java.util.List;

import pe.edu.upc.karwas.model.entity.Lavado;

public interface LavadoBusiness extends CrudBusiness<Lavado, Integer> {
	List<Lavado> readByTipolavado(String tipolavado) throws Exception;
}
