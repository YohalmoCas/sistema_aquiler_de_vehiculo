package gt1_p9.sistema_alquiler_de_vehiculo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SistemaAlquilerDeVehiculoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaAlquilerDeVehiculoApplication.class, args);
	}

}
