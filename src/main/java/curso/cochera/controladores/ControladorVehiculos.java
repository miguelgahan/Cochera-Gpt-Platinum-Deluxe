package curso.cochera.controladores;

import curso.cochera.modelos.Vehiculo;
import curso.cochera.servicios.ServicioVehiculos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("vehiculos")

public class ControladorVehiculos {

    @Autowired
    ServicioVehiculos servicioVehiculos;

    @GetMapping("todos")
    public List<Vehiculo> getAllVehiculos(){
        return servicioVehiculos.getAllVehiculos();
    };



}
