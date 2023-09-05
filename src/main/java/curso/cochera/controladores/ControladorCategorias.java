package curso.cochera.controladores;


import curso.cochera.modelos.Categorias;
import curso.cochera.modelos.Descuentos;
import curso.cochera.servicios.ServicioCategorias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categorias")

public class ControladorCategorias {


    @Autowired
    ServicioCategorias servicioCategorias;



    @GetMapping("todas")
    public List<Categorias> getAllCategorias(){
        return servicioCategorias.imprimirCategorias();
    };



    @PostMapping(value = "nueva",consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean nuevaCategoria(@RequestBody Categorias nuevaCategoria){

        try {
            return servicioCategorias.nuevaCategoria(nuevaCategoria);
        }
        catch (Exception error){
            return false;
        }

    }



}
