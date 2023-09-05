package curso.cochera.controladores;

import curso.cochera.modelos.Descuentos;
import curso.cochera.modelos.Precios;
import curso.cochera.servicios.ServicioDescuentos;
import curso.cochera.servicios.ServicioPrecios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("descuentos")



public class ControladorDescuentos {


    @Autowired
    ServicioDescuentos servicioDescuentos;

    @GetMapping("todos")
    public List<Descuentos> getAllDescuentos(){
        return servicioDescuentos.imprimirDescuentos();
    };

    @PostMapping(value = "nuevo",consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean nuevoDescuento(@RequestBody Descuentos nuevoDescuento){

        try {
        return servicioDescuentos.nuevoDescuento(nuevoDescuento);
        }
        catch (Exception error){
            return false;
        }

    }

    @DeleteMapping(value = "borrar", consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean borrarDescuento(@RequestBody Descuentos descuento){

        try {
            return servicioDescuentos.borrarDescuento(descuento);
        }
        catch (Exception error){
            return false;
        }
    }


    @PostMapping(value = "actualizar",consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean actualizarDescuento(@RequestBody Descuentos descuento){

        try {
            return servicioDescuentos.actualizarDescuentoPorCodigo(descuento.getCodigo(), descuento.getPorcentajeDescuento());
        }
        catch (Exception error){
            return false;
        }

    }


}


// Try y Catch
// Configurar IDs de bases de datos