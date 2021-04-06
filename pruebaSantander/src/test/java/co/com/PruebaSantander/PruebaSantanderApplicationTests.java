package co.com.PruebaSantander;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.com.PruebaSantander.servicio.ConsultaServicioCliente;

@SpringBootTest
class PruebaSantanderApplicationTests {
	
	@Autowired
	private ConsultaServicioCliente consultaServicioCliente;
	
	@Test
	void contextLoads() {
		assertThat(consultaServicioCliente).isNotNull();
	}

}
