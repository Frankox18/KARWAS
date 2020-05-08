package pe.edu.upc.karwas.model.repository;

import java.util.List;


import pe.edu.upc.karwas.model.entity.Lavado;

public interface LavadoRepository extends JpaRepository<Lavado, Integer> {
	List<Lavado> findByTipolavado(String tipolavado) throws Exception;
}
