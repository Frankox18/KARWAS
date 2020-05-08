package pe.edu.upc.karwas.business;

import java.util.List;

import pe.edu.upc.karwas.model.entity.Anuncio;

public interface AnuncioBusiness extends CrudBusiness<Anuncio, Integer>{
	List<Anuncio> readByPrecioServicio( Integer precioServicio ) throws Exception;
}
