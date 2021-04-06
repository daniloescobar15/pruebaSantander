package co.com.PruebaSantander.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import co.com.PruebaSantander.model.ClienteXProducto;


@Repository
public interface ClienteXProductoRepository extends CrudRepository<ClienteXProducto, Integer> {

	
	
	@Query( value = "SELECT * FROM Clientexproducto  WHERE client_name LIKE %:id%",   nativeQuery = true)
	Iterable<ClienteXProducto> findByid(@Param("id") String id);

	@Query( value = "SELECT * FROM Clientexproducto  WHERE cedula LIKE %:cedula%",   nativeQuery = true)
	Iterable<ClienteXProducto> findByCedula(String cedula);
	
	@Query( value = "SELECT * FROM Clientexproducto ",   nativeQuery = true)
	List<ClienteXProducto> findALL();



}
