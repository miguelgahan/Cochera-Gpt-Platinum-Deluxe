package curso.cochera.servicios;

import curso.cochera.modelos.Precios;
import curso.cochera.modelos.Vehiculo;
import curso.cochera.repositorios.RepositorioPrecios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServicioPrecios {

    private static RepositorioPrecios precioRepositorio;

    @Autowired
    ServicioPrecios(RepositorioPrecios repo){
        this.precioRepositorio = repo;
    }




    public static Precios returnPorCodigo(String codigo){
        if(codigo != null && !codigo.isEmpty()) {
            Precios returnPrecios = precioRepositorio.buscarPrecioPorCodigo(codigo);
            if (returnPrecios != null) return returnPrecios;
            else System.out.println("La categoria ¨" + codigo + "¨ no existe");
        }
        return null;
    };

    public List<Precios> getAllPrecios() {
        List<Precios> preciosEnLaBase = precioRepositorio.getAllPrecios();
        return preciosEnLaBase;
    };

    public static void borrarPorCodigo(String codigo){
        if(codigo != null && !codigo.isEmpty()) {
            precioRepositorio.eliminarPrecioPorCodigo(codigo);
        }
    };



}
