package pe.edu.upc.karwas.model.repository;

import java.util.List;

import pe.edu.upc.karwas.model.entity.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
	List<Empleado> findByCodigoEmpleado( Long codigoEmpleado ) throws Exception;
}
