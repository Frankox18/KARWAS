package pe.edu.upc.karwas.model.repository;

import java.util.List;

import pe.edu.upc.karwas.model.entity.Anuncio;

public interface AnuncioRepository extends JpaRepository<Anuncio, Integer> {
	
	List<Anuncio> findByPrecioServicio( Integer precioServicio ) throws Exception;
}
