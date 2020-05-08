package pe.edu.upc.karwas.business.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.transaction.Transactional;

import pe.edu.upc.karwas.business.EmpleadoBusiness;
import pe.edu.upc.karwas.model.entity.Empleado;
import pe.edu.upc.karwas.model.repository.EmpleadoRepository;

public class EmpleadoBusinessImpl implements EmpleadoBusiness, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EmpleadoRepository empleadoRepository;
	@Override
	@Transactional
	public Integer create(Empleado t) throws Exception {
		// TODO Auto-generated method stub
		return empleadoRepository.insert(t);
	}

	@Override
	@Transactional
	public Integer update(Empleado t) throws Exception {
		// TODO Auto-generated method stub
		return empleadoRepository.update(t);
	}

	@Override
	@Transactional
	public Integer delete(Empleado t) throws Exception {
		// TODO Auto-generated method stub
		return empleadoRepository.delete(t);
	}

	@Override
	public List<Empleado> readAll() throws Exception {
		// TODO Auto-generated method stub
		return empleadoRepository.findAll();
	}

	@Override
	public Optional<Empleado> readById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return empleadoRepository.findById(id);
	}

	@Override
	public List<Empleado> readByCodigoEmpleado(Long codigoEmpleado) throws Exception {
		// TODO Auto-generated method stub
		return empleadoRepository.findByCodigoEmpleado(codigoEmpleado);
	}

}
