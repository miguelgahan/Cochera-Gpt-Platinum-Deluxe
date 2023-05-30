package curso.cochera.servicios;


import curso.cochera.modelos.Descuentos;
import curso.cochera.modelos.Vehiculo;
import curso.cochera.repositorios.VehiculoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioVehiculos {
    private VehiculoRepositorio vehiculoRepositorio;

    @Autowired
    ServicioVehiculos(VehiculoRepositorio repo){
        this.vehiculoRepositorio = repo;
    }



    }





