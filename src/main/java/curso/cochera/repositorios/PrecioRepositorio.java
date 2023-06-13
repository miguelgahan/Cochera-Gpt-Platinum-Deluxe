package curso.cochera.repositorios;

import curso.cochera.modelos.Precios;
import curso.cochera.modelos.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrecioRepositorio extends JpaRepository<Precios,Integer> {

    @Query(value = "SELECT * FROM precios", nativeQuery = true)
    List<Precios> getAllPrecios();

}
