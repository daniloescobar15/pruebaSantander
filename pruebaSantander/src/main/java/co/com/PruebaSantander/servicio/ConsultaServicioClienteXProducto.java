package co.com.PruebaSantander.servicio;

import co.com.PruebaSantander.model.ClienteXProducto;

public interface ConsultaServicioClienteXProducto {

	public Iterable<ClienteXProducto> findByid(String id);

	public Iterable<ClienteXProducto> findByCedula(String cedula);

	public Iterable<ClienteXProducto> findAll();

	public void addCliente(ClienteXProducto cliente);
}
