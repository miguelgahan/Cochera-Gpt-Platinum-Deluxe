package curso.cochera.controladores;

import curso.cochera.modelos.Descuentos;
import curso.cochera.modelos.Precios;
import curso.cochera.servicios.ServicioPrecios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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


    @PostMapping(value = "actualizar",consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean actualizarPrecios(@RequestBody Precios precios){

        try {
            return servicioPrecios.actualizarPreciosPorCodigo(precios.getCodigo(), precios.getPrecioHora(), precios.getPrecioDia(), precios.getPrecioSemana(), precios.getPrecioMes());
        }
        catch (Exception error){
            return false;
        }

    }

    @PostMapping(value = "nuevo",consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean nuevoPrecio(@RequestBody Precios precios){
        try {
            return servicioPrecios.nuevoPrecio(precios);
        }
        catch (Exception error){
            return false;
        }

    }

}
