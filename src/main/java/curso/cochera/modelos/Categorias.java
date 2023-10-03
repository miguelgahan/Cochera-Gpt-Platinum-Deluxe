package curso.cochera.modelos;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "categorias")

public class Categorias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    Integer id;

    @Column(name = "codigo")
    String codigo;

    @Column(name = "descripcion")
    String descripcion;

    @Column (name = "precio")
    String precio;



    // este constructor y este get ya no son necesarios porque agregamos longbok al proyecto.

 /*  public CategoriaVehiculo(Integer id, String nombre, Precios precio, String descripcion){
        this.id = id;
        this.codigo = codigo;
        this.precio = precio;
        this.descripcion = descripcion;
    };

    public Precios getPrecio(){
        return this.precio;
    };

*/

}

