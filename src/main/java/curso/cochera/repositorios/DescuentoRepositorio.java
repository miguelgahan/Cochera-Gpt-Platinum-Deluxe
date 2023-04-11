package curso.cochera.repositorios;

import curso.cochera.modelos.Descuentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository


public interface DescuentoRepositorio extends JpaRepository <Descuentos,Integer> {

    @Query(value = "SELECT * FROM descuentos", nativeQuery = true)
    List<Descuentos> getAllDescuentos();


    @Query(value = "SELECT descripcion FROM descuentos", nativeQuery = true)
    List<String> getAllDescripciones();


    @Query(value = "SELECT * FROM descuentos WHERE descuentos.codigo = ?1", nativeQuery = true)
    Descuentos getDescuentosPorCodigo(String codigo);



}
