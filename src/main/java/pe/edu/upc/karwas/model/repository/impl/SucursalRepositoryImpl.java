package pe.edu.upc.karwas.model.repository.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.karwas.model.entity.Sucursal;
import pe.edu.upc.karwas.model.repository.SucursalRepository;

public class SucursalRepositoryImpl implements SucursalRepository,Serializable {
	
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "KarwasPU")
	private EntityManager em;

	@Override
	public Integer insert(Sucursal t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer update(Sucursal t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer delete(Sucursal t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sucursal> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Sucursal> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sucursal> findByDistrito(String distrito) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
