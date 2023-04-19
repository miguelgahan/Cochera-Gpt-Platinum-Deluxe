package curso.cochera;

import curso.cochera.servicios.ServicioDescuentos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CocheraApplication {
@Autowired
static ServicioDescuentos servicioDescuentos;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CocheraApplication.class, args);



		ServicioDescuentos servicioDescuentos = context.getBean(ServicioDescuentos.class);

		servicioDescuentos.imprimirDescuentos();

	}




}
