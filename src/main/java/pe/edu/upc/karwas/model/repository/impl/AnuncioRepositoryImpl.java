package pe.edu.upc.karwas.model.repository.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.karwas.model.entity.Anuncio;
import pe.edu.upc.karwas.model.repository.AnuncioRepository;

public class AnuncioRepositoryImpl implements AnuncioRepository,Serializable {


	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "KarwasPU")
	private EntityManager em;
	@Override
	public Integer insert(Anuncio t) throws Exception {
		em.persist(t);
		return t.getId();
	}
	@Override
	public Integer update(Anuncio t) throws Exception {
		em.merge(t);
		return t.getId();
	}
	@Override
	public Integer delete(Anuncio t) throws Exception {
		em.merge(t);
		return t.getId();
	}
	@Override
	public List<Anuncio> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<Anuncio> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Anuncio> findByPrecioServicio(Integer precioServicio) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
