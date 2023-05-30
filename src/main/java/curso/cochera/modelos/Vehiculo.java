package curso.cochera.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "vehiculos")

public class Vehiculo {

    @Id
    @Column(name = "id")
    Integer id;
    @Column(name = "ingreso")
    LocalDateTime ingreso;
    LocalDateTime egreso;
    @Column(name = "patente")
    String patente;
    Double montoAcumulado;
    @Column(name = "categoria")
    String codigoCategoria;

    Categoria categoriaVehiculo;


// tabla de vehiculos que tenga id patente ingreso categoria.




    public LocalDateTime getIngreso(){
       return this.ingreso;
    };



    public void setEgreso(LocalDateTime egreso){
        this.egreso = egreso;
    };


    public Double getMontoAcumulado(){
        return this.montoAcumulado;
    };


    //calcular monto acumulado del vehiculo nuevo en main. (grafico 2)


    public void setMontoAcumulado(Double montoAcumulado){this.montoAcumulado = montoAcumulado;};


  /*  public void calcularMontoAcumulado() {

        Double plataPorSemanas = 0d;
        Double plataPorMeses = 0d;
        Double plataPorDias = 0d;
        Double plataPorHoras = 0d;
        Precios precios = categoriaVehiculo.getPrecio();
        LocalDateTime tiempoRestado = egreso;
        Long meses = ChronoUnit.MONTHS.between(ingreso, egreso);




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
            plataPorHoras = horas * precios.precioHora;
        }


        System.out.println("Plata x horas:" + plataPorHoras + " |Plata x dias: " + plataPorDias + "|Plata x semanas: " + plataPorSemanas + "|Plata x meses: " + plataPorMeses);


        this.montoAcumulado = plataPorHoras + plataPorDias + plataPorSemanas + plataPorMeses;


    }

   */



}


