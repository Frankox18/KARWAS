package pe.edu.upc.karwas.model.repository;

import java.util.List;

import pe.edu.upc.karwas.model.entity.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer>{
List<Empresa> findByRuc(String ruc) throws Exception;
List<Empresa> findByNombre(String nombre) throws Exception;
}
