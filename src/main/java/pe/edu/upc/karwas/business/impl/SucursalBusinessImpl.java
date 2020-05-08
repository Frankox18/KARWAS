package pe.edu.upc.karwas.business.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.transaction.Transactional;

import pe.edu.upc.karwas.business.SucursalBusiness;
import pe.edu.upc.karwas.model.entity.Sucursal;
import pe.edu.upc.karwas.model.repository.SucursalRepository;

public class SucursalBusinessImpl implements SucursalBusiness, Serializable {


	private static final long serialVersionUID = 1L;

	@Inject
	private SucursalRepository sucursalRepository;
	@Override
	@Transactional
	public Integer create(Sucursal t) throws Exception {
		// TODO Auto-generated method stub
		return sucursalRepository.insert(t);
	}

	@Override
	@Transactional
	public Integer update(Sucursal t) throws Exception {
		// TODO Auto-generated method stub
		return sucursalRepository.update(t);
	}

	@Override
	@Transactional
	public Integer delete(Sucursal t) throws Exception {
		// TODO Auto-generated method stub
		return sucursalRepository.delete(t);
	}

	@Override
	public List<Sucursal> readAll() throws Exception {
		// TODO Auto-generated method stub
		return sucursalRepository.findAll();
	}

	@Override
	public Optional<Sucursal> readById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return sucursalRepository.findById(id);
	}

	@Override
	public List<Sucursal> readByDistrito(String distrito) throws Exception {
		// TODO Auto-generated method stub
		return sucursalRepository.findByDistrito(distrito);
	}

}
