package pe.edu.upc.karwas.model.repository.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.edu.upc.karwas.model.entity.Persona;
import pe.edu.upc.karwas.model.repository.PersonaRepository;

public class PersonaRepositoryImpl implements PersonaRepository,Serializable{

	
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "KarwasPU")
	private EntityManager em;

	@Override
	public Integer insert(Persona t) throws Exception {
		em.persist(t);
		return t.getId();
	}

	@Override
	public Integer update(Persona t) throws Exception {
		em.merge(t);
		return t.getId();
	}

	@Override
	public Integer delete(Persona t) throws Exception {
		em.remove(t);
		return t.getId();
	}

	@Override
	public List<Persona> findAll() throws Exception {
		List<Persona> personas = new ArrayList<>();
		TypedQuery<Persona> query = em.createQuery("SELECT p FROM Persona AS p", Persona.class);
		personas = query.getResultList();
		return personas;
	}

	@Override
	public Optional<Persona> findById(Integer id) throws Exception {
		List<Persona> personas = new ArrayList<>();
		TypedQuery<Persona> query = em.createQuery("SELECT p FROM Persona p WHERE P.id = ?1", Persona.class);
		query.setParameter(1, id);
		personas = query.getResultList();
		if(personas == null || personas.isEmpty())
			return Optional.empty();
		else
		    return Optional.of(personas.get(0));
	}

	@Override
	public List<Persona> findByApellido(String apellido) throws Exception {
		List<Persona> comisarias = new ArrayList<>();
		TypedQuery<Persona> query = em.createQuery("SELECT p FROM Persona p WHERE P.apellido LIKE ?1", Persona.class);
		query.setParameter(1, "%" + apellido + "%");
		comisarias = query.getResultList();
		return comisarias;
	}

	@Override
	public List<Persona> findByDni(Integer dni) throws Exception {
		List<Persona> comisarias = new ArrayList<>();
		TypedQuery<Persona> query = em.createQuery("SELECT p FROM Persona p WHERE P.dni LIKE ?1", Persona.class);
		query.setParameter(1, "%" + dni + "%");
		comisarias = query.getResultList();
		return comisarias;	}
}
