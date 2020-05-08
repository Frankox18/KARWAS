package pe.edu.upc.karwas.model.repository.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.karwas.model.entity.Empresa;
import pe.edu.upc.karwas.model.repository.EmpresaRepository;

public class EmpresaRepositoryImpl implements EmpresaRepository,Serializable{
	
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "KarwasPU")
	private EntityManager em;

	@Override
	public Integer insert(Empresa t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer update(Empresa t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer delete(Empresa t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empresa> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Empresa> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empresa> findByRuc(String ruc) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empresa> findByNombre(String nombre) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
