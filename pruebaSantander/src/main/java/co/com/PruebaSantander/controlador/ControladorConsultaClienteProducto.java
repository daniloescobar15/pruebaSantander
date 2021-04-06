package co.com.PruebaSantander.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.com.PruebaSantander.model.ClienteXProducto;
import co.com.PruebaSantander.servicio.ConsultaServicioClienteXProducto;

@RestController
@RequestMapping("/v1/clienteXProducto")
public class ControladorConsultaClienteProducto {
	
	@Autowired
	private ConsultaServicioClienteXProducto consultaServicioClientexProducto;
	
	@GetMapping("/consultaClienteXProductoPorId/{id}")
	public Iterable<ClienteXProducto> findByNombre(@PathVariable String nombre){
		return consultaServicioClientexProducto.findByid(nombre);
	}
	
	@GetMapping("/consultaClientePorCedula/{cedula}")
	public Iterable<ClienteXProducto> findByCedula(@PathVariable String cedula){
		return consultaServicioClientexProducto.findByCedula(cedula);
	}
	
	@GetMapping
	public Iterable<ClienteXProducto> findAll(){
		return consultaServicioClientexProducto.findAll();
	}
	
	@PostMapping("/addClienteXProducto/")
	public void  addCliente(@RequestBody ClienteXProducto cliente){
		consultaServicioClientexProducto.addCliente(cliente);
	}
}
