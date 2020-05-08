package pe.edu.upc.karwas.business.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.transaction.Transactional;

import pe.edu.upc.karwas.business.LavadoBusiness;
import pe.edu.upc.karwas.model.entity.Lavado;
import pe.edu.upc.karwas.model.repository.LavadoRepository;

public class LavadoBusinessImpl implements LavadoBusiness, Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private LavadoRepository lavadoRepository;
	@Override
	@Transactional
	public Integer create(Lavado t) throws Exception {
		// TODO Auto-generated method stub
		return lavadoRepository.insert(t);
	}

	@Override
	@Transactional
	public Integer update(Lavado t) throws Exception {
		// TODO Auto-generated method stub
		return lavadoRepository.update(t);
	}

	@Override
	@Transactional
	public Integer delete(Lavado t) throws Exception {
		// TODO Auto-generated method stub
		return lavadoRepository.delete(t);
	}

	@Override
	public List<Lavado> readAll() throws Exception {
		// TODO Auto-generated method stub
		return lavadoRepository.findAll();
	}

	@Override
	public Optional<Lavado> readById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return lavadoRepository.findById(id);
	}

	@Override
	public List<Lavado> readByTipolavado(String tipolavado) throws Exception {
		// TODO Auto-generated method stub
		return lavadoRepository.findByTipolavado(tipolavado);
	}

}
