package curso.cochera.servicios;


import curso.cochera.modelos.Descuentos;
import curso.cochera.modelos.Precios;
import curso.cochera.modelos.Vehiculo;
import curso.cochera.repositorios.RepositorioVehiculos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class ServicioVehiculos {
    private static RepositorioVehiculos vehiculoRepositorio;

    @Autowired
    ServicioVehiculos(RepositorioVehiculos repo){
        this.vehiculoRepositorio = repo;
    }


    public boolean ingresoDeVehiculo(Vehiculo nuevoVehiculo){
        if (nuevoVehiculo == null){
            return false;
        }
        nuevoVehiculo.setIngreso(LocalDateTime.now());
        vehiculoRepositorio.save(nuevoVehiculo);
        return true;

    }

    public void imprimirAllVehiculos(){
        List<Vehiculo> vehiculosEnLaBase = vehiculoRepositorio.getAllVehiculos();
        System.out.println(vehiculosEnLaBase);
};
    public List<Vehiculo> getAllVehiculos(){
        List<Vehiculo> vehiculosEnLaBase = vehiculoRepositorio.getAllVehiculos();
        return vehiculosEnLaBase;
    };

        public Vehiculo returnPorPatente(String codigo){
        if(codigo != null && !codigo.isEmpty()) {
            Vehiculo returnVehiculos = vehiculoRepositorio.buscarVehiculoPorPatente(codigo);
            if (returnVehiculos != null) return returnVehiculos;
            else System.out.println("La patente \"" + codigo + "\" no existe");
        }
        return null;
    };

        public Double calcularMontoAcumulado(Vehiculo vehiculo, Precios precios) {
        LocalDateTime ingreso = vehiculo.getIngreso();
        Double plataPorSemanas = 0d;
        Double plataPorMeses = 0d;
        Double plataPorDias = 0d;
        Double plataPorHoras = 0d;
        LocalDateTime tiempoRestado = LocalDateTime.now();
        Long meses = ChronoUnit.MONTHS.between(ingreso, tiempoRestado);




        if (meses > 0){
            plataPorMeses = meses * precios.getPrecioMes();
            tiempoRestado = tiempoRestado.minusMonths(meses);

        }

        Long semanas = ChronoUnit.WEEKS.between(ingreso, tiempoRestado);
        if(semanas > 0){

            plataPorSemanas = semanas * precios.getPrecioSemana();
            tiempoRestado = tiempoRestado.minusWeeks(semanas);

        }

        Long dias = ChronoUnit.DAYS.between(ingreso, tiempoRestado);
        if (dias > 0){
            plataPorDias = dias * precios.getPrecioDia();
            tiempoRestado = tiempoRestado.minusDays(dias);
        }

        Long horas = ChronoUnit.HOURS.between(ingreso, tiempoRestado);
        if (horas > 0){
            plataPorHoras = horas * precios.getPrecioHora();
        }


        System.out.println("Plata x horas:" + plataPorHoras + " |Plata x dias: " + plataPorDias + "|Plata x semanas: " + plataPorSemanas + "|Plata x meses: " + plataPorMeses);


        return plataPorHoras + plataPorDias + plataPorSemanas + plataPorMeses;


    }

    public boolean actualizarVehiculoPorPatente (Vehiculo vehiculo){
        Vehiculo vehiculoBd = vehiculoRepositorio.buscarVehiculoPorPatente(vehiculo.getPatente());
        if(vehiculoBd != null){
            vehiculoBd.setCodigoCategoria(vehiculo.getCodigoCategoria());
        }
        vehiculoRepositorio.save(vehiculoBd);
        return true;
    }


    }





