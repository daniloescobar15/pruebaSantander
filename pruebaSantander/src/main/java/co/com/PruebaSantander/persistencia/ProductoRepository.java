package co.com.PruebaSantander.persistencia;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import co.com.PruebaSantander.model.Producto;


//https://www.baeldung.com/spring-data-jpa-query

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer> {

	
	
	@Query( value = "SELECT * FROM Producto  WHERE nombre LIKE %:nombre%",   nativeQuery = true)
	Iterable<Producto> findByNombre(@Param("nombre") String nombre);

	@Query( value = "SELECT * FROM Producto  WHERE id LIKE %:id%",   nativeQuery = true)
	Iterable<Producto> findById(String id);
	
	
	

}
