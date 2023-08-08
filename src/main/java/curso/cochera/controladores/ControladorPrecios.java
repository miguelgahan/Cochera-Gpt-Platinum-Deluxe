package curso.cochera.controladores;

import curso.cochera.modelos.Precios;
import curso.cochera.servicios.ServicioPrecios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("precios")

public class ControladorPrecios {

    @Autowired
    ServicioPrecios servicioPrecios;

    @GetMapping("todos")
    public List<Precios> getAllPrecios(){
        return servicioPrecios.getAllPrecios();
    };


}
