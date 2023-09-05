package curso.cochera.servicios;

import curso.cochera.modelos.Categorias;
import curso.cochera.modelos.Precios;
import curso.cochera.modelos.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioManager {

    private ServicioCategorias servicioCategorias;
    private ServicioPrecios servicioPrecios;
    private ServicioVehiculos servicioVehiculos;

    @Autowired
    public ServicioManager(ServicioCategorias servicioCategorias,
                           ServicioPrecios servicioPrecios,
                           ServicioVehiculos servicioVehiculos) {
        this.servicioCategorias = servicioCategorias;
        this.servicioPrecios = servicioPrecios;
        this.servicioVehiculos = servicioVehiculos;
    }

    public Double cerrarTicket(String patente){

        if (patente == null){
            return 0.0;
        }

        Vehiculo vehiculo = servicioVehiculos.returnPorPatente(patente);
        if(vehiculo == null){
            return 0.0;
        }

        Categorias categoria = servicioCategorias.returnPorCodigo(vehiculo.getCodigoCategoria());
        Precios precios = servicioPrecios.returnPorCodigo(categoria.getPrecio());

        return servicioVehiculos.calcularMontoAcumulado(vehiculo, precios);


    }





}
