package pe.edu.upc.karwas.model.repository.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.karwas.model.entity.Persona;
import pe.edu.upc.karwas.model.repository.PersonaRepository;

public class PersonaRepositoryImpl implements PersonaRepository,Serializable{

	
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "KarwasPU")
	private EntityManager em;

	@Override
	public Integer insert(Persona t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer update(Persona t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer delete(Persona t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Persona> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> findByApellido(String apellido) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> findByDni(String dni) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
