package curso.cochera.modelos;

import java.util.List;


public class ParkingSlot {

    Integer id;
    List<Vehiculo> vehiculos;
    CategoriaVehiculo categoriaVehiculo;
    Integer capacidadDisponible;

    Estado estado;

    public Integer getId(){
    return this.id;
};

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public CategoriaVehiculo getCategoriaVehiculo(){
        return this.categoriaVehiculo;
    };

    public Integer getCapacidadDisponible(){
        return this.capacidadDisponible;
    };


    public Estado getEstado() {
        return estado;
    }

    public void setId(Integer id){
     this.id = id;
    };

    public void setVehiculos(List<Vehiculo> vehiculos){
        this.vehiculos = vehiculos;
    };

    public void setCategoriaVehiculo(CategoriaVehiculo categoriaVehiculo){
        this.categoriaVehiculo = categoriaVehiculo;
    };

    public void setCapacidadDisponible(Integer capacidadDisponible){
        this.capacidadDisponible = capacidadDisponible;
    };

    public void setEstado(Estado estado){
        this.estado = estado;
    };

};

