package pe.edu.upc.karwas.model.repository.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.edu.upc.karwas.model.entity.Rol;
import pe.edu.upc.karwas.model.repository.RolRepository;

public class RolRepositoryImpl implements RolRepository, Serializable{


	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "KarwasPU")
	private EntityManager em;
	@Override
	public Integer insert(Rol t) throws Exception {
		em.persist(t);
		return t.getId();
	}

	@Override
	public Integer update(Rol t) throws Exception {
		em.merge(t);
		return t.getId();
	}

	@Override
	public Integer delete(Rol t) throws Exception {
		em.remove(t);
		return t.getId();
	}

	@Override
	public List<Rol> findAll() throws Exception {
		List<Rol> roles = new ArrayList<>();
		TypedQuery<Rol> query = em.createQuery("SELECT r FROM Rol AS r", Rol.class);
		roles = query.getResultList();
		return roles;
	}

	@Override
	public Optional<Rol> findById(Integer id) throws Exception {
		List<Rol> roles  = new ArrayList<>();
		TypedQuery<Rol> query = em.createQuery("SELECT r FROM Rol r WHERE R.id = ?1", Rol.class);
		query.setParameter(1, id);
		roles  = query.getResultList();
		if(roles == null || roles.isEmpty())
			return Optional.empty();
		else
		    return Optional.of(roles.get(0));
	}

	@Override
	public List<Rol> findByNombreRol(String nombreRol) throws Exception {
		List<Rol> roles = new ArrayList<>();
		TypedQuery<Rol> query = em.createQuery("SELECT r FROM Rol r WHERE r.nombreRol LIKE ?1", Rol.class);
		query.setParameter(1, "%" + nombreRol + "%");
		roles = query.getResultList();
		return roles;
	}

}
