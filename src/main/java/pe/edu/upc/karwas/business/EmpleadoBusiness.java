package pe.edu.upc.karwas.business;

import java.util.List;

import pe.edu.upc.karwas.model.entity.Empleado;

public interface EmpleadoBusiness extends CrudBusiness<Empleado, Integer> {
	List<Empleado> readByCodigoEmpleado( Long codigoEmpleado ) throws Exception;
}
