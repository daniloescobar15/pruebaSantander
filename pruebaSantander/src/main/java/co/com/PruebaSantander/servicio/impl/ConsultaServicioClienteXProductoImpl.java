package co.com.PruebaSantander.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.com.PruebaSantander.model.ClienteXProducto;
import co.com.PruebaSantander.persistencia.ClienteXProductoRepository;
import co.com.PruebaSantander.servicio.ConsultaServicioClienteXProducto;


@Service
public class ConsultaServicioClienteXProductoImpl implements ConsultaServicioClienteXProducto {
	
	@Autowired
	private ClienteXProductoRepository repository;


	@Override
	public Iterable<ClienteXProducto> findByid(String id) {
		return repository.findByid(id);
	}
	
	@Override
	public Iterable<ClienteXProducto> findByCedula(String cedula) {
		return repository.findByCedula(cedula);
	}

	@Override
	public Iterable<ClienteXProducto> findAll() {
		return repository.findAll();
	}

	@Override
	public void addCliente(ClienteXProducto cliente) {
		repository.save(cliente);
		
	}
	
}
