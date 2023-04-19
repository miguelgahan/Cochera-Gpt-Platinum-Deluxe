package curso.cochera.servicios;


import curso.cochera.modelos.Descuentos;
import curso.cochera.repositorios.DescuentoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioDescuentos {

    private DescuentoRepositorio descuentoRepositorio;

    @Autowired
    ServicioDescuentos(DescuentoRepositorio repo){
        this.descuentoRepositorio = repo;
    }

    public void imprimirDescuentos(){
        List<Descuentos> descuentosEnLaBase = descuentoRepositorio.getAllDescuentos();
        System.out.println(descuentosEnLaBase);
    };



}
