package curso.cochera.servicios;


import curso.cochera.modelos.Vehiculo;
import curso.cochera.repositorios.VehiculoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ServicioVehiculos {
    private VehiculoRepositorio vehiculoRepositorio;

    @Autowired
    ServicioVehiculos(VehiculoRepositorio repo){
        this.vehiculoRepositorio = repo;
    }


    public void ingresoDeVehiculo(Integer id, String patente, LocalDateTime ingreso, String codigoCategoria){

        Vehiculo nuevoVehiculo = new Vehiculo();



        nuevoVehiculo.setId(id);
        nuevoVehiculo.setPatente(patente);
        nuevoVehiculo.setIngreso(ingreso);
        nuevoVehiculo.setCodigoCategoria(codigoCategoria);

        vehiculoRepositorio.save(nuevoVehiculo);

    }

    public void imprimirAllVehiculos(){
        List<Vehiculo> vehiculosEnLaBase = vehiculoRepositorio.getAllVehiculos();
        System.out.println(vehiculosEnLaBase);
};

    }





