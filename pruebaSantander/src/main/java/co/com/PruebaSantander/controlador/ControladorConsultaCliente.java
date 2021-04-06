package co.com.PruebaSantander.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import co.com.PruebaSantander.model.Cliente;
import co.com.PruebaSantander.servicio.ConsultaServicioCliente;

@RestController
@RequestMapping("/v1/cliente")
public class ControladorConsultaCliente {

	@Autowired
	private ConsultaServicioCliente consultaServicioCliente;

	private static final Logger logger = LogManager.getLogger(ControladorConsultaCliente.class);

	@GetMapping("/consultaClienteNombre/{nombre}")
	public Iterable<Cliente> findByNombre(@PathVariable String nombre) {
		logger.info("Inicia servicio findByNombre");
		return consultaServicioCliente.findByNombre(nombre);
	}

	@GetMapping("/consultaClientecedula/{cedula}")
	public Iterable<Cliente> findByCedula(@PathVariable String cedula) {
		logger.info("Inicia servicio findByCedula");
		return consultaServicioCliente.findByCedula(cedula);
	}

	@GetMapping
	public Iterable<Cliente> findAll() {
		logger.info("Inicia servicio findAll");
		return consultaServicioCliente.findAll();
	}

	@DeleteMapping("/deleteAllClient/")
	public void deleteAll() {
		logger.info("Inicia servicio deleteAll");
		consultaServicioCliente.deleteAll();
	}

	@DeleteMapping("/deleteCedula/{cedula}")
	public void deleteCedula(@PathVariable Integer cedula) {
		logger.info("Inicia servicio deletecedula");
		consultaServicioCliente.deletecedula(cedula);
	}

	@PostMapping("/addCliente/")
	public void addCliente(@RequestBody Cliente cliente) {
		logger.info("Inicia servicio addCliente");
		consultaServicioCliente.addCliente(cliente);
	}

	@PostMapping("/updateCliente/")
	public void updateCliente(@RequestBody Cliente cliente) {
		logger.info("Inicia servicio updateCliente");
		consultaServicioCliente.updateCliente(cliente);
	}
}
