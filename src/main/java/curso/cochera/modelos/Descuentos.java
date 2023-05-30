package curso.cochera.modelos;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "descuentos")

public class Descuentos {
    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    Integer id;

    @Column(name = "codigo")
    String codigo;

    @Column(name = "porcentaje")
    Integer porcentajeDescuento;

    @Column(name = "descripcion")
    String descripcion;


    public Descuentos(){};
    public Descuentos(String codigo, Integer porcentajeDescuento, String descripcion, Integer id){
        this.codigo = codigo;
        this.porcentajeDescuento = porcentajeDescuento;
        this.descripcion = descripcion;
        this.id = id;

    }

    //Hay que modificar la cuenta.
   public Double calcularDescuento (Double montoAcumulado){

       Double montoConDescuento = 0d;

       montoConDescuento = montoAcumulado - (montoAcumulado * this.porcentajeDescuento);

       return montoConDescuento;

   };







}
