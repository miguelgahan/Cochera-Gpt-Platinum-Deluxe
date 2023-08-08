package curso.cochera.repositorios;

import curso.cochera.modelos.Precios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioPrecios extends JpaRepository<Precios,Integer> {

    @Query(value = "SELECT * FROM precios", nativeQuery = true)
    List<Precios> getAllPrecios();
    @Query(value= "SELECT * FROM precios WHERE codigo=?1", nativeQuery = true)
    Precios buscarPrecioPorCodigo(String codigo);

    @Query(value = "DELETE * FROM precios WHERE codigo=?1", nativeQuery = true )
    Precios eliminarPrecioPorCodigo(String codigo);

}
