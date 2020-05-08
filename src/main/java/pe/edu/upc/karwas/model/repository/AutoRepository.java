package pe.edu.upc.karwas.model.repository;

import java.util.List;

import pe.edu.upc.karwas.model.entity.Auto;

public interface AutoRepository  extends JpaRepository<Auto, Integer>{
	List<Auto> findByMarca(String marca) throws Exception;
	List<Auto> findByModelo( String modelo ) throws Exception;
}
