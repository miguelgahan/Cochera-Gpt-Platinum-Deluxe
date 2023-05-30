package curso.cochera.repositorios;


import curso.cochera.modelos.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface VehiculoRepositorio extends JpaRepository<VehiculoRepositorio,Integer> {

    @Query(value = "SELECT * FROM vehiculos", nativeQuery = true)
    List<Vehiculo> getAllVehiculos();

    @Query(value= "SELECT * FROM vehiculos WHERE codigo=?1", nativeQuery = true)
    String buscarCategoriaPorCodigo(String codigo);





}