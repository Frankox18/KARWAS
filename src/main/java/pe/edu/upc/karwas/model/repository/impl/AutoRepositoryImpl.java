package pe.edu.upc.karwas.model.repository.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.karwas.model.entity.Auto;
import pe.edu.upc.karwas.model.repository.AutoRepository;

public class AutoRepositoryImpl implements AutoRepository,Serializable {
	
	private static final long serialVersionUID= 1L;
	
	@PersistenceContext(unitName = "KarwasPU")
	private EntityManager em;
	@Override
	public Integer insert(Auto t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer update(Auto t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer delete(Auto t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Auto> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Auto> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Auto> findByMarca(String marca) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Auto> findByModelo(String modelo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
