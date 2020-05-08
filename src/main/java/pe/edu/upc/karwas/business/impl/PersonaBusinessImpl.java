package pe.edu.upc.karwas.business.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.transaction.Transactional;

import pe.edu.upc.karwas.business.PersonaBusiness;
import pe.edu.upc.karwas.model.entity.Persona;
import pe.edu.upc.karwas.model.repository.PersonaRepository;

public class PersonaBusinessImpl implements PersonaBusiness, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private PersonaRepository personaRepository;
	@Override
	@Transactional
	public Integer create(Persona t) throws Exception {
		// TODO Auto-generated method stub
		return personaRepository.insert(t);
	}

	@Override
	@Transactional
	public Integer update(Persona t) throws Exception {
		// TODO Auto-generated method stub
		return personaRepository.update(t);
	}

	@Override
	@Transactional
	public Integer delete(Persona t) throws Exception {
		// TODO Auto-generated method stub
		return personaRepository.delete(t);
	}

	@Override
	public List<Persona> readAll() throws Exception {
		// TODO Auto-generated method stub
		return personaRepository.findAll();
	}

	@Override
	public Optional<Persona> readById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return personaRepository.findById(id);
	}

	@Override
	public List<Persona> readByApellido(String apellido) throws Exception {
		// TODO Auto-generated method stub
		return personaRepository.findByApellido(apellido);
	}

	@Override
	public List<Persona> readByDni(Integer dni) throws Exception {
		// TODO Auto-generated method stub
		return personaRepository.findByDni(dni);
	}

}
