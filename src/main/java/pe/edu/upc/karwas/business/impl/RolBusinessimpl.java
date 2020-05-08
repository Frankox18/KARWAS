package pe.edu.upc.karwas.business.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.transaction.Transactional;

import pe.edu.upc.karwas.business.RolBusiness;
import pe.edu.upc.karwas.model.entity.Rol;
import pe.edu.upc.karwas.model.repository.RolRepository;

public class RolBusinessimpl implements RolBusiness, Serializable{

	private static final long serialVersionUID = 1L;
	@Inject
	private RolRepository rolRepository;
	@Override
	@Transactional
	public Integer create(Rol t) throws Exception {
		// TODO Auto-generated method stub
		return rolRepository.insert(t);
	}

	@Override
	@Transactional
	public Integer update(Rol t) throws Exception {
		// TODO Auto-generated method stub
		return rolRepository.update(t);
	}

	@Override
	@Transactional
	public Integer delete(Rol t) throws Exception {
		// TODO Auto-generated method stub
		return rolRepository.delete(t);
	}

	@Override
	public List<Rol> readAll() throws Exception {
		// TODO Auto-generated method stub
		return rolRepository.findAll();
	}

	@Override
	public Optional<Rol> readById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return rolRepository.findById(id);
	}

	@Override
	public List<Rol> readfindByNombreRol(String nombreRol) throws Exception {
		// TODO Auto-generated method stub
		return rolRepository.findByNombreRol(nombreRol);
	}

}
