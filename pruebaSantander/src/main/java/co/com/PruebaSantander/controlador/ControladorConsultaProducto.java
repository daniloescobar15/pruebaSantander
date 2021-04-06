package co.com.PruebaSantander.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.com.PruebaSantander.model.Producto;
import co.com.PruebaSantander.servicio.ConsultaServicioProducto;

@RestController
@RequestMapping("/v1/producto")
public class ControladorConsultaProducto {
	
	@Autowired
	private ConsultaServicioProducto consultaServicioProducto;
	
	@GetMapping("/consultaProductoNombre/{nombre}")
	Iterable<Producto> findByNombre(@PathVariable String nombre){
		return consultaServicioProducto.findByNombre(nombre);
	}
	
	@GetMapping("/consultaProductoId/{id}")
	Iterable<Producto> findByCedula(@PathVariable String id){
		return consultaServicioProducto.findById(id);
	}
	


}
