package pe.edu.upc.karwas.model.repository.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.karwas.model.entity.Lavado;
import pe.edu.upc.karwas.model.repository.LavadoRepository;

public class LavadoRepositoryImpl implements LavadoRepository,Serializable{
	
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "KarwasPU")
	private EntityManager em;

	@Override
	public Integer insert(Lavado t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer update(Lavado t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer delete(Lavado t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lavado> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Lavado> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lavado> findByTipolavado(String tipolavado) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
