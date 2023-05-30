package curso.cochera.repositorios;

import curso.cochera.modelos.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface CategoriaRepositorio extends JpaRepository<Categoria,Integer> {

    @Query(value = "SELECT * FROM categorias", nativeQuery = true)
    List<Categoria> getAllCategorias();

    @Query(value= "SELECT * FROM categorias WHERE codigo=?1", nativeQuery = true)
    Categoria buscarCategoriaPorCodigo(String codigo);





}
