package co.com.PruebaSantander.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.PruebaSantander.model.Cliente;
import co.com.PruebaSantander.persistencia.ClienteRepository;
import co.com.PruebaSantander.servicio.ConsultaServicioCliente;


@Service
public class ConsultaServicioClienteImpl implements ConsultaServicioCliente {
	
	@Autowired
	private ClienteRepository repository;


	
	@Override
	public Iterable<Cliente> findByNombre(String nombre) {
		return repository.findByNombre(nombre);
	}
	
	@Override
	public Iterable<Cliente> findByCedula(String cedula) {
		return repository.findByCedula(cedula);
	}

	@Override
	public Iterable<Cliente> findAll() {
		return repository.findAll();
	}

	@Override
	public void addCliente(Cliente cliente) {
		repository.save(cliente);
		
	}

	@Override
	public void deleteAll() {
		 repository.deleteAll();
		
	}

	@Override
	public void deletecedula(Integer cedula) {
		
		repository.deleteById(cedula);
		
	}

	@Override
	public void updateCliente(Cliente cliente) {
		repository.save(cliente);
		
	}


	
}
