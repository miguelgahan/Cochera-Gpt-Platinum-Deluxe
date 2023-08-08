package curso.cochera.repositorios;

import curso.cochera.modelos.Descuentos;
import curso.cochera.modelos.Precios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository


public interface RepositorioDescuentos extends JpaRepository <Descuentos,Integer> {

    @Query(value = "SELECT * FROM descuentos", nativeQuery = true)
    List<Descuentos> getAllDescuentos();


    @Query(value = "SELECT descripcion FROM descuentos", nativeQuery = true)
    List<String> getAllDescripciones();


    @Query(value = "SELECT * FROM descuentos WHERE descuentos.codigo = ?1", nativeQuery = true)
    Descuentos buscarDescuentosPorCodigo(String codigo);


    @Query(value = "SELECT * FROM descuentos WHERE descuentos.id > ?1 AND descuentos.porcentaje > ?2", nativeQuery = true)
    List<Descuentos> getAllDescuentosIdMayorYPorcentajeMayor(Integer id,Integer porcentaje);

    @Query(value = "DELETE FROM descuentos WHERE codigo=?1", nativeQuery = true )
    Precios eliminarDescuentoPorCodigo(String codigo);
}



