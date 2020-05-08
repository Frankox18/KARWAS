package pe.edu.upc.karwas.business.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.transaction.Transactional;

import pe.edu.upc.karwas.business.AutoBusiness;
import pe.edu.upc.karwas.model.entity.Auto;
import pe.edu.upc.karwas.model.repository.AutoRepository;

public class AutoBusinessImpl implements AutoBusiness, Serializable {

	private static final long serialVersionUID = 1L;
    @Inject
    private AutoRepository autoRepository;
	@Override
	@Transactional
	public Integer create(Auto t) throws Exception {
		// TODO Auto-generated method stub
		return autoRepository.insert(t);
	}

	@Override
	@Transactional
	public Integer update(Auto t) throws Exception {
		// TODO Auto-generated method stub
		return autoRepository.update(t);
	}

	@Override
	@Transactional
	public Integer delete(Auto t) throws Exception {
		// TODO Auto-generated method stub
		return autoRepository.delete(t);
	}

	@Override
	public List<Auto> readAll() throws Exception {
		// TODO Auto-generated method stub
		return autoRepository.findAll();
	}

	@Override
	public Optional<Auto> readById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return autoRepository.findById(id);
	}

	@Override
	public List<Auto> readByMarca(String marca) throws Exception {
		// TODO Auto-generated method stub
		return autoRepository.findByMarca(marca);
	}

	@Override
	public List<Auto> readByModelo(String modelo) throws Exception {
		// TODO Auto-generated method stub
		return autoRepository.findByModelo(modelo);
	}

}
