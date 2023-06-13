package curso.cochera.servicios;

import curso.cochera.repositorios.PrecioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServicioPrecios {

    private PrecioRepositorio precioRepositorio;

    @Autowired
    ServicioPrecios(PrecioRepositorio repo){
        this.precioRepositorio = repo;
    }


    


}
