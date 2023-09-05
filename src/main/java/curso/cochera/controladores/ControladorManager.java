package curso.cochera.controladores;


import curso.cochera.modelos.Descuentos;
import curso.cochera.modelos.Vehiculo;
import curso.cochera.servicios.ServicioManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("manager")

public class ControladorManager {


    @Autowired
    ServicioManager servicioManager;


    @PostMapping(value = "cerrar",consumes = MediaType.APPLICATION_JSON_VALUE)
    public double cerrarTicket(@RequestBody String patente){

        try {
            return servicioManager.cerrarTicket(patente);
        }
        catch (Exception error){
            return 0.0;
        }

    }






}
