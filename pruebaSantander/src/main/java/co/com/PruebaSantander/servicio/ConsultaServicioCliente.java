package co.com.PruebaSantander.servicio;

import co.com.PruebaSantander.model.Cliente;

public interface ConsultaServicioCliente {

	public Iterable<Cliente> findByNombre(String nombre);

	public Iterable<Cliente> findByCedula(String cedula);

	public Iterable<Cliente> findAll();

	public void addCliente(Cliente cliente);

	public void  deleteAll();

	public void deletecedula(Integer cedula);

	public void updateCliente(Cliente cliente);
}
