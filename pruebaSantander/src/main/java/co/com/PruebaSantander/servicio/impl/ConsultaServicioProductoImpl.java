package co.com.PruebaSantander.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.PruebaSantander.model.Cliente;
import co.com.PruebaSantander.model.Producto;
import co.com.PruebaSantander.persistencia.ClienteRepository;
import co.com.PruebaSantander.persistencia.ProductoRepository;
import co.com.PruebaSantander.servicio.ConsultaServicioCliente;
import co.com.PruebaSantander.servicio.ConsultaServicioProducto;


@Service
public class ConsultaServicioProductoImpl implements ConsultaServicioProducto {
	
	@Autowired
	private ProductoRepository repository;


	
	@Override
	public Iterable<Producto> findByNombre(String nombre) {
		return repository.findByNombre(nombre);
	}
	
	@Override
	public Iterable<Producto> findById(String id) {
		return repository.findById(id);
	}
	
}
