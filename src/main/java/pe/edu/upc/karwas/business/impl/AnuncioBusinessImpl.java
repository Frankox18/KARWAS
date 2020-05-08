package pe.edu.upc.karwas.business.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.transaction.Transactional;

import pe.edu.upc.karwas.business.AnuncioBusiness;
import pe.edu.upc.karwas.model.entity.Anuncio;
import pe.edu.upc.karwas.model.repository.AnuncioRepository;

public class AnuncioBusinessImpl implements AnuncioBusiness, Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private AnuncioRepository anuncioRepository;
	@Override
	@Transactional
	public Integer create(Anuncio t) throws Exception {
		// TODO Auto-generated method stub
		return anuncioRepository.insert(t);
	}

	@Override
	@Transactional
	public Integer update(Anuncio t) throws Exception {
		// TODO Auto-generated method stub
		return anuncioRepository.update(t);
	}

	@Override
	@Transactional
	public Integer delete(Anuncio t) throws Exception {
		// TODO Auto-generated method stub
		return anuncioRepository.delete(t);
	}

	@Override
	public List<Anuncio> readAll() throws Exception {
		// TODO Auto-generated method stub
		return anuncioRepository.findAll();
	}

	@Override
	public Optional<Anuncio> readById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return anuncioRepository.findById(id);
	}

	@Override
	public List<Anuncio> readByPrecioServicio(Integer precioServicio) throws Exception {
		// TODO Auto-generated method stub
		return anuncioRepository.findByPrecioServicio(precioServicio);
	}

}
