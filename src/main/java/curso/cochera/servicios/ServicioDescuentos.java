package curso.cochera.servicios;


import curso.cochera.modelos.Descuentos;
import curso.cochera.repositorios.DescuentoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioDescuentos {

    private DescuentoRepositorio descuentoRepositorio;

    @Autowired
    ServicioDescuentos(DescuentoRepositorio repo){
        this.descuentoRepositorio = repo;
    }

    public void imprimirDescuentos(){
        List<Descuentos> descuentosEnLaBase = descuentoRepositorio.getAllDescuentos();
        System.out.println(descuentosEnLaBase);
    };

    public void nuevoDescuento(Descuentos nuevoDescuento){
        if (nuevoDescuento == null) return;
        Integer porcentaje = nuevoDescuento.getPorcentajeDescuento() ;
        if (1 >  porcentaje || 100 < porcentaje) return;
        //Limitamos la descripciona a 80 caracteres.
        if(nuevoDescuento.getDescripcion().length()> 80){
          nuevoDescuento.setDescripcion(nuevoDescuento.getDescripcion().substring(0, 79));
        }
        // esta funcion save viene con el springboot..
        descuentoRepositorio.save(nuevoDescuento);

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



    public void actualizarDescuentoPorCodigo (String codigo, Integer nuevoDescuento){
        if(nuevoDescuento <1 || nuevoDescuento>100) return;
        Descuentos descuentoModificado = descuentoRepositorio.buscarDescuentosPorCodigo(codigo);
        if(descuentoModificado != null){
            descuentoModificado.setPorcentajeDescuento(nuevoDescuento);
        }
        descuentoRepositorio.save(descuentoModificado);
    }
}
