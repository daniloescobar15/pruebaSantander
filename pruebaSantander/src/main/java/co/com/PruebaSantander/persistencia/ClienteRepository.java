package co.com.PruebaSantander.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.com.PruebaSantander.model.Cliente;



//https://www.baeldung.com/spring-data-jpa-query

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

	
	
	@Query( value = "SELECT * FROM Cliente  WHERE client_name LIKE %:nombre%",   nativeQuery = true)
	Iterable<Cliente> findByNombre(@Param("nombre") String nombre);

	@Query( value = "SELECT * FROM Cliente  WHERE cedula LIKE %:cedula%",   nativeQuery = true)
	Iterable<Cliente> findByCedula(String cedula);
	
	@Query( value = "SELECT * FROM Cliente ",   nativeQuery = true)
	List<Cliente> findALL();



}
