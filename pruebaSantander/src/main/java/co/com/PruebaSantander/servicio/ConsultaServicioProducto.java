package co.com.PruebaSantander.servicio;


import co.com.PruebaSantander.model.Producto;

public interface ConsultaServicioProducto {

	Iterable<Producto> findByNombre(String nombre);

	Iterable<Producto> findById(String Id);
}
