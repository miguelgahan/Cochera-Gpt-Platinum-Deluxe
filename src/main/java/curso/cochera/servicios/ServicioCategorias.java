package curso.cochera.servicios;

import curso.cochera.modelos.Categorias;
import curso.cochera.repositorios.RepositorioCategorias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioCategorias {

    static RepositorioCategorias categoriaRepositorio;
    @Autowired
    ServicioCategorias(RepositorioCategorias repo){
        this.categoriaRepositorio = repo;
    }

    //Hacer funciones como las de servicioDescuentos.
    //Y hacer la tabla que falta.


    public void imprimirCategorias(){
        List<Categorias> categoriasEnLaBase = categoriaRepositorio.getAllCategorias();
        System.out.println(categoriasEnLaBase);
    };

    public void imprimirPorCodigo (String codigo){
        if(codigo == null || codigo.isEmpty()) return;
        Categorias imprimirCategorias = categoriaRepositorio.buscarCategoriaPorCodigo(codigo);
        if(imprimirCategorias != null) System.out.println(imprimirCategorias);
        else System.out.println("La categoria: "+codigo+ " no existe");
    };


    public Categorias returnPorCodigo(String codigo){
        if(codigo != null && !codigo.isEmpty()) {
            Categorias returnCategorias = categoriaRepositorio.buscarCategoriaPorCodigo(codigo);
            if (returnCategorias != null) return returnCategorias;
            else System.out.println("La categoria ¨" + codigo + "¨ no existe");
        }
        return null;
    };

//Hacer una funcion que sea como imprimirPorCodigo pero que devuelva un objeto categoria (return en vez de sout y en vez de void Categoria)
// Y en servicioPrecios hacer imprimirPorCodigo y otra con return y otra buscarPorCodigo.


}
