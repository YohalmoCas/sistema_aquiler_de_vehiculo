package gt1_p9.sistema_alquiler_de_vehiculo.service;

import gt1_p9.sistema_alquiler_de_vehiculo.model.Reserva;
import java.util.List;

public interface ReservaService extends CrudService<Reserva, Long> {
    Reserva crearReserva(Reserva reserva); 
    List<Reserva> listarPorCliente(Long idCliente);
    List<Reserva> listarPorVehiculo(Long idVehiculo);
}
