package curso.cochera.modelos;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name = "precios")

public class Precios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name ="id")
    Integer id;

    @Column (name = "codigo")
    String codigo;
    @Column (name = "Hora")
    Double precioHora;
    @Column (name = "Dia")
    Double precioDia;
    @Column (name = "Semana")
    Double precioSemana;
    @Column (name = "Mes")
    Double precioMes;

   /* public Precios(Double precioHora, Double precioDia, Double precioSemana, Double precioMes){
        this.precioHora = precioHora;
        this.precioDia = precioDia;
        this.precioSemana = precioSemana;
        this.precioMes = precioMes;

    };*/


    public Double getPrecioHora(){
        return this.precioHora;
    };
    public  Double getPrecioDia(){
        return this.precioDia;
    };
    public Double getPrecioSemana(){
        return this.precioSemana;
    };
    public Double getPrecioMes(){
        return this.precioMes;
    };



    public void setPrecioHora( Double precioHora){
        this.precioHora = precioHora;
    };

    public void setPrecioDia(Double precioDia) {
        this.precioDia = precioDia;
    };

    public void setPrecioSemana(Double precioSemana) {
        this.precioSemana = precioSemana;
    };

    public void setPrecioMes(Double precioMes) {
        this.precioMes = precioMes;
    };





    //Funcion:     QueClaseDevuelve + nombreDeLaFuncion + (Que recibe) + { Que hace } ;

/*
    public Double getPrecioHoraMoto(){
        return this.precioHoraMoto;
    };

     public Double getPrecioHoraAuto(){
        return this.precioHoraAuto;
    };

    public Double getPrecioHoraCamioneta(){
        return this.precioHoraCamioneta;
    };

    public void setPrecioHoraMoto(Double precioHoraMoto){
      this.precioHoraMoto = precioHoraMoto;
    };
    public void  setPrecioHoraAuto(Double precioHoraAuto){
        this.precioHoraAuto = precioHoraAuto;
    };
    public void  setPrecioHoraCamioneta(Double precioHoraCamioneta){
        this.precioHoraCamioneta = precioHoraCamioneta;
    };

    public void  setPrecios(Double precioHoraMoto, Double precioHoraAuto, Double precioHoraCamioneta){
        this.precioHoraMoto = precioHoraMoto;
        this.precioHoraAuto = precioHoraAuto;
        this.precioHoraCamioneta = precioHoraCamioneta;
    };
    */

}
