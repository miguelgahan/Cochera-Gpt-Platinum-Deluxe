package curso.cochera.servicios;


import curso.cochera.modelos.Descuentos;
import curso.cochera.repositorios.RepositorioDescuentos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioDescuentos {

    private RepositorioDescuentos descuentoRepositorio;

    @Autowired
    ServicioDescuentos(RepositorioDescuentos repo){
        this.descuentoRepositorio = repo;
    }

    public List<Descuentos> imprimirDescuentos(){
        List<Descuentos> descuentosEnLaBase = descuentoRepositorio.getAllDescuentos();
        System.out.println(descuentosEnLaBase);
        return descuentosEnLaBase;
    };

    public boolean nuevoDescuento(Descuentos nuevoDescuento){
        if (nuevoDescuento == null) return false;
        Integer porcentaje = nuevoDescuento.getPorcentajeDescuento() ;
        if (1 >  porcentaje || 100 < porcentaje) return false;
        //Limitamos la descripciona a 80 caracteres.
        if(nuevoDescuento.getDescripcion().length()> 80){
          nuevoDescuento.setDescripcion(nuevoDescuento.getDescripcion().substring(0, 79));
        }
        // esta funcion save viene con el springboot..
        descuentoRepositorio.save(nuevoDescuento);
        return true;

    }

    public void imprimirPorCodigo (String codigo){
        if(codigo == null || codigo.isEmpty()) return;
        Descuentos imprimirDescuento = descuentoRepositorio.buscarDescuentosPorCodigo(codigo);
        if(imprimirDescuento != null) System.out.println(imprimirDescuento);
        else System.out.println("El codigo: "+ codigo+ " no existe");
    }

    // escribir funcion que use buscarDescuentosPorCodigo (descuentoRepositorio):
    // 1. recibe un codigo e imprime todos los datos de ese descuento si lo encuentra. Le paso un string codigo en cocheraAplication
    // 2. te paso un codigo y un porcentaje para actualizar el descuento.



    public boolean actualizarDescuentoPorCodigo (String codigo, Integer nuevoDescuento){
        if(nuevoDescuento <1 || nuevoDescuento>100) return false;
        Descuentos descuentoModificado = descuentoRepositorio.buscarDescuentosPorCodigo(codigo);
        if(descuentoModificado != null){
            descuentoModificado.setPorcentajeDescuento(nuevoDescuento);
        }
        descuentoRepositorio.save(descuentoModificado);
        return true;
    }

    public boolean borrarDescuento(Descuentos descuento){
        if(descuento != null) {
            descuentoRepositorio.delete(descuento);
            return true;
            //descuentoRepositorio.eliminarDescuentoPorCodigo(codigo);
        }
        return false;
    };



}

//Hacer controlador de categorias
//Hacer put de actualizarDescuentoPorCodigo