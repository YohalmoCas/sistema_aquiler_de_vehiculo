package gt1_p9.sistema_alquiler_de_vehiculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gt1_p9.sistema_alquiler_de_vehiculo.model.EstadoReserva;

public interface EstadoReservaRepository extends JpaRepository<EstadoReserva, Long>{

}
