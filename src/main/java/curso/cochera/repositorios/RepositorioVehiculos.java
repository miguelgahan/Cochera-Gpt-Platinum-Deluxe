package curso.cochera.repositorios;


import curso.cochera.modelos.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface RepositorioVehiculos extends JpaRepository<Vehiculo,Integer> {

    @Query(value = "SELECT * FROM vehiculos", nativeQuery = true)
    List<Vehiculo> getAllVehiculos();

    @Query(value= "SELECT * FROM vehiculos WHERE patente=?1", nativeQuery = true)
    Vehiculo buscarVehiculoPorPatente(String codigo);





}