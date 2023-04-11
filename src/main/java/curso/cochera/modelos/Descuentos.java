package curso.cochera.modelos;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "descuentos")

public class Descuentos {
    @Column(name = "id")
    Integer id;

    @Column(name = "codigo")
    String codigo;

    @Column(name = "porcentaje")
    Double porcentajeDescuento;

    @Column(name = "descripcion")
    String descripcion;


   public Double calcularDescuento (Double montoAcumulado){

       Double montoConDescuento = 0d;

       montoConDescuento = montoAcumulado - (montoAcumulado * this.porcentajeDescuento);

       return montoConDescuento;

   };







}
