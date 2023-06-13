package curso.cochera.servicios;

import curso.cochera.modelos.Categoria;
import curso.cochera.repositorios.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioCategorias {

    CategoriaRepositorio categoriaRepositorio;
    @Autowired
    ServicioCategorias(CategoriaRepositorio repo){
        this.categoriaRepositorio = repo;
    }

    //Hacer funciones como las de servicioDescuentos.
    //Y hacer la tabla que falta.


    public void imprimirCategorias(){
        List<Categoria> categoriasEnLaBase = categoriaRepositorio.getAllCategorias();
        System.out.println(categoriasEnLaBase);
    };

    public void imprimirPorCodigo (String codigo){
        if(codigo == null || codigo.isEmpty()) return;
        Categoria imprimirCategorias = categoriaRepositorio.buscarCategoriaPorCodigo(codigo);
        if(imprimirCategorias != null) System.out.println(imprimirCategorias);
        else System.out.println("La categoria: "+codigo+ " no existe");
    };




}
