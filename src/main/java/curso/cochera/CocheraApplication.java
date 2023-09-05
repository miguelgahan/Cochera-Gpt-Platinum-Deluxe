package curso.cochera;


import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.TimeZone;


@SpringBootApplication
public class CocheraApplication {


	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CocheraApplication.class, args);



	}


	@PostConstruct
	void started() {
		TimeZone.setDefault(TimeZone.getTimeZone("GMT-3"));
	}


}


//Controlador manager, usar cerrarTicket (recibe Vehiculo)

