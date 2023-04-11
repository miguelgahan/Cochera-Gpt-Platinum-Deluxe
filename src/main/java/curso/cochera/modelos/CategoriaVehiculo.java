package curso.cochera.modelos;

public class CategoriaVehiculo {
    Integer id;
    String nombre;
    Precios precio;



    // este constructor y este get ya no son necesarios porque agregamos longbok al proyecto.

   public CategoriaVehiculo(Integer id, String nombre, Precios precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    };

    public Precios getPrecio(){
        return this.precio;
    };



}

