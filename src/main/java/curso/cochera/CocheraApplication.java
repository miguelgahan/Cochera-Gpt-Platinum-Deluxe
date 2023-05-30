package curso.cochera;

import curso.cochera.modelos.Descuentos;
import curso.cochera.modelos.Vehiculo;
import curso.cochera.modelos.Categoria;
import curso.cochera.servicios.ServicioCategorias;
import curso.cochera.servicios.ServicioDescuentos;
import curso.cochera.servicios.ServicioVehiculos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CocheraApplication {
@Autowired
static  ServicioCategorias servicioCategorias;
//static  ServicioVehiculos servicioVehiculos;
//static ServicioDescuentos servicioDescuentos;
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CocheraApplication.class, args);



		//ServicioDescuentos servicioDescuentos = context.getBean(ServicioDescuentos.class);

		ServicioCategorias servicioCategorias = context.getBean(ServicioCategorias.class);

		//ServicioVehiculos servicioVehiculos = context.getBean(ServicioVehiculos.class);

		Descuentos newDescuento = new Descuentos();
		newDescuento.setId(8);
		newDescuento.setPorcentajeDescuento(13);
		newDescuento.setCodigo("19191");
		newDescuento.setDescripcion("aaaaa");


		//servicioDescuentos.nuevoDescuento(newDescuento);

		//servicioDescuentos.imprimirDescuentos();

		//servicioDescuentos.imprimirPorCodigo("asd123");

		//servicioDescuentos.imprimirPorCodigo("19191");

		//servicioDescuentos.actualizarDescuentoPorCodigo("19191",20);

		//servicioDescuentos.imprimirPorCodigo("19191");



		servicioCategorias.imprimirPorCodigo("asfjas144");



	}



}
