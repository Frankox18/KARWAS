package pe.edu.upc.karwas.model.repository.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.karwas.model.entity.Empleado;
import pe.edu.upc.karwas.model.repository.EmpleadoRepository;

public class EmpleadoRepositoryImpl  implements EmpleadoRepository,Serializable{
	
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "KarwasPU")
	private EntityManager em;

	@Override
	public Integer insert(Empleado t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer update(Empleado t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer delete(Empleado t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleado> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Empleado> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleado> findByCodigoEmpleado(Long codigoEmpleado) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
