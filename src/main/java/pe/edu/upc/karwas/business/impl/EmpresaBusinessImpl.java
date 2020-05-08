package pe.edu.upc.karwas.business.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.transaction.Transactional;

import pe.edu.upc.karwas.business.EmpresaBusiness;
import pe.edu.upc.karwas.model.entity.Empresa;
import pe.edu.upc.karwas.model.repository.EmpresaRepository;

public class EmpresaBusinessImpl implements EmpresaBusiness, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EmpresaRepository empresaRepository;
	@Override
	@Transactional
	public Integer create(Empresa t) throws Exception {
		// TODO Auto-generated method stub
		return empresaRepository.insert(t);
	}

	@Override
	@Transactional
	public Integer update(Empresa t) throws Exception {
		// TODO Auto-generated method stub
		return empresaRepository.update(t);
	}

	@Override
	@Transactional
	public Integer delete(Empresa t) throws Exception {
		// TODO Auto-generated method stub
		return empresaRepository.delete(t);
	}

	@Override
	public List<Empresa> readAll() throws Exception {
		// TODO Auto-generated method stub
		return empresaRepository.findAll();
	}

	@Override
	public Optional<Empresa> readById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return empresaRepository.findById(id);
	}

	@Override
	public List<Empresa> readByRuc(String ruc) throws Exception {
		// TODO Auto-generated method stub
		return empresaRepository.findByRuc(ruc);
	}

	@Override
	public List<Empresa> readByNombre(String nombre) throws Exception {
		// TODO Auto-generated method stub
		return empresaRepository.findByNombre(nombre);
	}

}
