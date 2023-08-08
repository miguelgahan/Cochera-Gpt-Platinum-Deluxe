package curso.cochera.repositorios;

import curso.cochera.modelos.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface RepositorioCategorias extends JpaRepository<Categorias,Integer> {

    @Query(value = "SELECT * FROM categorias", nativeQuery = true)
    List<Categorias> getAllCategorias();

    @Query(value= "SELECT * FROM categorias WHERE codigo=?1", nativeQuery = true)
    Categorias buscarCategoriaPorCodigo(String codigo);





}
