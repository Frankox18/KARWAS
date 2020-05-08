package pe.edu.upc.karwas.business.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.transaction.Transactional;

import pe.edu.upc.karwas.business.ClienteBusiness;
import pe.edu.upc.karwas.model.entity.Cliente;
import pe.edu.upc.karwas.model.repository.ClienteRepository;

public class ClienteBusinessImpl implements ClienteBusiness, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private ClienteRepository clienteRepository;
	@Override
	@Transactional
	public Integer create(Cliente t) throws Exception {
		// TODO Auto-generated method stub
		return clienteRepository.insert(t);
	}

	@Override
	@Transactional
	public Integer update(Cliente t) throws Exception {
		// TODO Auto-generated method stub
		return clienteRepository.update(t);
	}

	@Override
	@Transactional
	public Integer delete(Cliente t) throws Exception {
		// TODO Auto-generated method stub
		return clienteRepository.delete(t);
	}

	@Override
	public List<Cliente> readAll() throws Exception {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}

	@Override
	public Optional<Cliente> readById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return clienteRepository.findById(id);
	}

}
